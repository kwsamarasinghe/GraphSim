package cui.tcs.graphsim.graph;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.tinkerpop.blueprints.Vertex;

import cui.tcs.graphsim.engine.NodeProcess;
import cui.tcs.graphsim.engine.Packet;

public abstract class Node implements Vertex {

	//Node process associated with the node
	protected NodeProcess process;
	
	//Buffer
	protected ConcurrentLinkedQueue<Packet> buffer;

	/**
	 * Node is initialized with the associated process
	 * @param process
	 */
	public Node(NodeProcess process){
		this.process=process;
	}
	
	public abstract void startProcess();
	
	/**
	 * Returns the associated node process
	 * @return process
	 */
	public NodeProcess getProcess(){
		return process;
	}
	
	/**
	 * Enqueues a packet to the buffer
	 * @param packet
	 */
	public ConcurrentLinkedQueue<Packet> getBuffer(){
		return buffer;
	}
	
	
}
