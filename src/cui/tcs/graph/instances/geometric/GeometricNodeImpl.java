package cui.tcs.graph.instances.geometric;

import java.util.HashMap;

import cui.tcs.graph.Node;

/**
 * A node for a geometric graph with properties such as geometric coordinates
 * 
 * @author Kasun Samarasinghe
 *
 */
public class GeometricNodeImpl implements Node{
	
	//Unique ID
	private int id;
	
	//Coordinates
	private double x,y;
	
	/**
	 * Attribute map
	 */
	private final HashMap<String, String> attributes = new HashMap<>();

	/**
	 * @param x - x coordinate
	 * @param y - y coordinate
	 */
	public GeometricNodeImpl(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Computes the Euclidean distance between two nodes
	 * @param v - destination node
	 * @return distance to node v from this node
	 */
	public double distanceTo(GeometricNodeImpl v){
		
		double x_=v.getX();
		double y_=v.getY();
		
		double distance=Math.sqrt(Math.pow((x-x_),2)+Math.pow((y-y_),2));
		return distance;
	}
	
	public void setID(int id){
		this.id=id;
	}
	
	public void setX(double x){
		this.x=x;
	}

	public void setY(double y){
		this.y=y;
	}
	
	@Override
	public void setAttribute(String key, String value) {
		attributes.put(key, value);
	}

	public int getID(){
		return id;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	@Override
	public Object getAttribute(String key) {
		return attributes.get(key);
	}

}
