package cui.tcs.graphsim.engine;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Packet forwarder which forwards packets to the respective destination
 * 
 * @author Kasun Samarasinghe
 *
 * @param <T>
 *            packet
 */
public class PacketForwarder implements Runnable {

	// Packet queue
	private ConcurrentLinkedQueue<Packet> packetQueue;

	public PacketForwarder() {
		packetQueue = new ConcurrentLinkedQueue<Packet>();
	}

	/**
	 * Packet forwarder process which continuously look for new packets and
	 * forward them
	 */
	public void run() {

		while (true) {
			while (!packetQueue.isEmpty()) {
				Packet packet = packetQueue.remove();

				int ttl = packet.getTTL();
				if (ttl > 0) {
					packet.setTTL(--ttl);
					int nextHop = packet.getNextHop();
					System.out.println("Next hop " + nextHop);
					SimulationContext context = Engine.getContext();
					NodeProcess nextHopProcess = context.getProcess(nextHop);

					nextHopProcess.handlePacket(packet);
				} else {
					System.out.println("TTL expired, packet is dropped");
				}
			}
		}
	}

	public void sendPacket(Packet packet) {
		System.out.println("Packet is placed on the queue: destination " + packet.getDestination());
		packetQueue.add(packet);
	}
}
