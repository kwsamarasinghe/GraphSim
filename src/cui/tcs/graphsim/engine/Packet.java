package cui.tcs.graphsim.engine;

/**
 * A packet 
 * @author Kasun Samarasinghe
 *
 */
public class Packet {

	protected int destination;
	
	protected int source;
	
	public void setSource(int source){
		this.source=source;
	}
	
	public void setDesnation(int desnation){
		this.destination=desnation;
	}
	
	
	public int getSource(){
		return source;
	}
	
	public int getDestination(){
		return destination;
	}
}
