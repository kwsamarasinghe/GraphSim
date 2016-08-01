package cui.tcs.graphsim.engine;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Packet forwarder which forwards packets to the respective destination
 * @author Kasun Samarasinghe
 *
 * @param <T> packet
 */
public class PacketForwarder<P> implements Runnable{

	private ConcurrentLinkedQueue<P> packetQueue;
	
	public PacketForwarder(){
		packetQueue = new ConcurrentLinkedQueue<P>();
	}

	/**
	 * Packet forwarder process which continously look for new packets and forward them
	 */
	public void run() {
		
		while(true){
			while(!packetQueue.isEmpty()){
				P packet=packetQueue.peek();
			}
		}
	}
}
