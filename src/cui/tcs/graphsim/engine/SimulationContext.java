package cui.tcs.graphsim.engine;

import java.util.Collection;
import java.util.HashMap;


public class SimulationContext {
	
	//Graph
	private HashMap<Integer, NodeProcess> nodeProcessMap;
	
	//Forwarder
	private PacketForwarder forwarder;
	
	public SimulationContext(PacketForwarder forwarder){
		this.forwarder=forwarder;
		nodeProcessMap=new HashMap<Integer, NodeProcess>();
	}
	
	/**
	 * Returns the packet forwarder
	 * @return PacketForwarder - packet forwarder 
	 */
	public PacketForwarder getForwarder(){
		return forwarder;
	}
	
	/**
	 * Registers the node process
	 * @param id - node id
	 * @param process - node process associated with id
	 */
	public synchronized void registerNodeProcess(int id,NodeProcess process){
		nodeProcessMap.put(id, process);
	}
	
	/**
	 * Returns the node process
	 * @param id - node id
	 * @return NodeProcess - node process associated with node id
	 */
	public synchronized NodeProcess getProcess(int id){
		return nodeProcessMap.get(id);
	}
	
	public synchronized Collection<NodeProcess> getNodeProcesses(){
		return nodeProcessMap.values();
	}

}
