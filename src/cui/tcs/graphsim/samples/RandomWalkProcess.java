package cui.tcs.graphsim.samples;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.tinkerpop.blueprints.Vertex;

import cui.tcs.graphsim.engine.NodeProcess;
import cui.tcs.graphsim.engine.Packet;

/**
 * Simple random walk node process just forwards the packets to a neighboring
 * node
 * 
 * @author Kasun Samarasinghe
 *
 */
public class RandomWalkProcess implements NodeProcess {

	// Packet buffer
	private ConcurrentLinkedQueue<Packet> buffer;

	//Associated node
	private Vertex vertex;
	
	public RandomWalkProcess(Vertex vertex){
		this.vertex=vertex;
		buffer=new ConcurrentLinkedQueue<Packet>();
	}
	
	/**
	 * Node process
	 */
	public void run() {
		
		System.out.println("starting the node process for "+vertex.getId());
		// sample process which generates a packet and performs a random
		// walk
		if ((int) vertex.getId() == 0) {

		}

	}

	public void handlePacket(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Receiving a packet from " + packet.getSource() + " to" + packet.getDestination());

	}

}

/**
 * Packet handler thread which processes packets from the buffer and process
 */
class PacketHandler implements Runnable{
	
	ConcurrentLinkedQueue<Packet> buffer;
	
	public PacketHandler(ConcurrentLinkedQueue<Packet> buffer){
		this.buffer=buffer;
	}
	
	public void run(){
		while(!buffer.isEmpty()){
			
		}
	}
}