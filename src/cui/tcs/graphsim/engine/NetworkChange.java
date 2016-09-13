package cui.tcs.graphsim.engine;

import java.util.Hashtable;

/**
 * Change in the network
 * This object holds a change of the network taken place in terms of 
 * operations takes place during the simulation 
 * @author Kasun Samarasinghe
 *
 */
public class NetworkChange {
	
	private String type;
	
	private double timestamp;
	
	private Hashtable<String, String> parameters;
	
	public NetworkChange(String type, double timestamp){
		this.type=type;
		this.timestamp=timestamp;
	}

	/**
	 * Adds a parameter
	 * @param key - key of the parameter
	 * @param value -value of the parameter
	 */
	public void addParameters(String key, String value){
		parameters.put(key, value);
	}
	
	public String getType(){
		return type;
	}
	
	public double getTimeStamp(){
		return timestamp;
	}
	
	public Hashtable<String, String> getParameters(){
		return parameters;
	}
}
