package cui.tcs.graphsim.engine;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;

import cui.tcs.graphsim.samples.RandomWalkProcess;

/**
 * Packet forwarder which forwards packets to the respective destination
 * @author Kasun Samarasinghe
 *
 * @param <T> packet	
 */
public class PacketForwarder implements Runnable{

	//Graph
	private Graph graph;
	
	//Packet queue
	private ConcurrentLinkedQueue<Packet> packetQueue;
	
	public PacketForwarder(Graph graph){
		packetQueue = new ConcurrentLinkedQueue<Packet>();
	}

	/**
	 * Packet forwarder process which continuously look for new packets and forward them
	 */
	public void run() {
		
		while(true){
			while(!packetQueue.isEmpty()){
				Packet packet=packetQueue.peek();
				
				int destination=packet.getDestination();
				Vertex destinationNode=graph.getVertex(destination);
				
				
				//process.handlePacket(packet);
			}
		}
	}
}
