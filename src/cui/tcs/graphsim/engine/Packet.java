package cui.tcs.graphsim.engine;

/**
 * A packet 
 * @author Kasun Samarasinghe
 *
 */
public class Packet {

	protected int destination;
	
	protected int source;
	
	protected int nextHop;
	
	public void setSource(int source){
		this.source=source;
	}
	
	public void setDesnation(int desnation){
		this.destination=desnation;
	}
	
	public void setNextHop(int nextHop){
		this.nextHop=nextHop;
	}
	
	
	public int getSource(){
		return source;
	}
	
	public int getDestination(){
		return destination;
	}
	
	public int getNextHop(){
		return nextHop;
	}
}
