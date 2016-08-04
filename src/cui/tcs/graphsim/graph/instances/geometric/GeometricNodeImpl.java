package cui.tcs.graphsim.graph.instances.geometric;

import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.VertexQuery;

import cui.tcs.graphsim.engine.NodeProcess;
import cui.tcs.graphsim.graph.Node;

/**
 * A node for a geometric graph with properties such as geometric coordinates
 * 
 * @author Kasun Samarasinghe
 *
 */
public class GeometricNodeImpl extends Node{
	
	//Unique ID
	private int id;
	
	//Coordinates
	private double x,y;
	
	/**
	 * Attribute map
	 */
	private final HashMap<String, Object> properties = new HashMap<>();
	
	/**
	 * Set of edges adjacent to this node
	 */
	private Vector<Edge> edges = new Vector<Edge>(); 

	/**
	 * @param x - x coordinate
	 * @param y - y coordinate
	 */
	public GeometricNodeImpl(double x, double y, NodeProcess process) {
		super(process);
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
	public Edge addEdge(String key, Vertex v) {
		GeometricNodeImpl neighbor=(GeometricNodeImpl)v;
		Edge neighborEdge=new GeometricEdgeImpl(this,neighbor);
		edges.add(neighborEdge);
		return neighborEdge;
	}

	@Override
	public Iterable<Edge> getEdges(Direction direction, String... edgeLabels) {
		return edges;
	}

	/**
	 * Returns the adjacent vertices
	 * @param direction (for directed graphs)
	 * @param edge labels
	 * @return adjacent vertices
	 */
	public Iterable<Vertex> getVertices(Direction direction, String... edgeLabels) {
		//Currently no edge labels so return all the neighboring vertices
		Vector<Vertex> neighbors=new Vector<Vertex>();
		for(Edge edge: edges){
			GeometricNodeImpl target=((GeometricEdgeImpl)edge).getTarget();
			neighbors.addElement(target);
		}
		return neighbors;
	}

	@Override
	public VertexQuery query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getId() {
		return id;
	}

	@Override
	public <T> T getProperty(String key) {
		return (T)properties.get(key);
	}

	@Override
	public Set<String> getPropertyKeys() {
		return properties.keySet();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T removeProperty(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProperty(String key, Object value) {
		properties.put(key, value);
	}

	@Override
	public void startProcess() {
		Thread nodeProcessThread=new Thread(process);
		nodeProcessThread.start();
	}

}
