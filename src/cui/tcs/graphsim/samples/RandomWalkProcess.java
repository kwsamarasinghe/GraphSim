package cui.tcs.graphsim.samples;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.tinkerpop.blueprints.Vertex;

import cui.tcs.graphsim.engine.NodeProcess;
import cui.tcs.graphsim.engine.Packet;
import cui.tcs.graphsim.engine.PacketForwarder;
import cui.tcs.graphsim.engine.SimulationContext;
import cui.tcs.graphsim.graph.instances.geometric.GeometricNodeImpl;

/**
 * Simple random walk node process just forwards the packets to a neighboring
 * node
 * 
 * @author Kasun Samarasinghe
 *
 */
public class RandomWalkProcess implements NodeProcess {

	// Packet buffer
	private ConcurrentLinkedQueue<Packet> packetQueue;

	// Associated node
	private Vertex vertex;

	private SimulationContext context;

	public RandomWalkProcess(Vertex vertex, SimulationContext context) {
		this.vertex = vertex;
		this.context = context;
		packetQueue = new ConcurrentLinkedQueue<Packet>();
	}

	/**
	 * Node process
	 */
	public void run() {

		System.out.println("starting the node process for " + vertex.getId());
		// sample process which generates a packet and performs a random
		// walk
		if ((int) vertex.getId() == 0) {
			// Assumes we get the destination
			Random random = new Random();
			int destinationID = random.nextInt(10);

			Packet packet = new Packet();
			packet.setDesnation(destinationID);
			packet.setTTL(100);
			
			PacketForwarder forwarder = context.getForwarder();
			forwarder.sendPacket(packet);
		}

	}

	public void handlePacket(Packet packet) {
		System.out.println("Receiving a packet from " + packet.getSource() + " to" + packet.getDestination());
		packetQueue.add(packet);

		Thread packetHandler = new Thread(new PacketHandler(this, packetQueue, context));
		packetHandler.start();
	}

	public Vertex getNode() {
		return vertex;
	}

}

/**
 * Packet handler thread which processes packets from the buffer and process
 */
class PacketHandler implements Runnable {

	ConcurrentLinkedQueue<Packet> packetQueue;

	SimulationContext context;

	RandomWalkProcess mainProcess;

	public PacketHandler(RandomWalkProcess randomWalkProcess, ConcurrentLinkedQueue<Packet> packetQueue,
			SimulationContext context) {
		this.mainProcess = randomWalkProcess;
		this.packetQueue = packetQueue;
		this.context = context;
	}

	public void run() {
		PacketForwarder forwarder = context.getForwarder();

		while (!packetQueue.isEmpty()) {
			Packet packet = packetQueue.remove();
			int destination = packet.getDestination();

			// Checks if the destination is a neighbor
			Vertex node = mainProcess.getNode();
			if (((GeometricNodeImpl) node).isNeighbor(destination)) {
				int hops = 100 - packet.getTTL();
				System.out.println("Destination is reached in " + hops + " hops");
			} else {

				Vertex nextNode = null;
				Iterable<Vertex> neighborNodes = node.getVertices(null, "");
				for (Vertex neighbor : neighborNodes) {
					if (Math.random() > 0.5) {
						nextNode = neighbor;
						break;
					}
				}

				if (nextNode == null) {
					nextNode = neighborNodes.iterator().next();
				}

				packet.setNextHop((int) nextNode.getId());
				forwarder.sendPacket(packet);
			}
		}
	}
}