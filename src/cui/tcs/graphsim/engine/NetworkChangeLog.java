package cui.tcs.graphsim.engine;

import java.util.Vector;

/**
 * Maintains a log of network operations taken place
 * @author Kasun Samarasinghe
 *
 */
public class NetworkChangeLog {

	/**
	 * Operation types
	 */
	public static enum networkOperations{
		NODE_DROP,EDGE_DROP,MESSAGE_SENT
	};
	
	private Vector<NetworkChange> log;
	
	private int timeWindow;
	
	
	public NetworkChangeLog(int timeWindow){
		log=new Vector<NetworkChange>();
	}
	
	/**
	 * Adds a network change
	 * @param change
	 */
	public void addNetworkChange(NetworkChange change){
		if(log.size()<timeWindow){
			log.add(change);
		}else{
			log.remove(log.size()-1);
			log.add(change);
		}
	}
}
