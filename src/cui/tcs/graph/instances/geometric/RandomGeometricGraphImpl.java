package cui.tcs.graph.instances.geometric;

import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

import cui.tcs.graph.ConnectivityGraph;
import cui.tcs.graph.Edge;
import cui.tcs.graph.Node;

/**
 * Random geometric graph is a connectivity model of a wireless ad-hoc network
 * Nodes are distributed within a given region at random and two nodes are
 * connected if they are with in the radio coverage of each other
 * 
 * @author Kasun Samarasinghe
 *
 */
public class RandomGeometricGraphImpl implements ConnectivityGraph {

	/**
	 * Set of nodes
	 */
	private final LinkedList<GeometricNodeImpl> nodes = new LinkedList<GeometricNodeImpl>();

	/**
	 * Adjacency list representation
	 */
	private final Vector<LinkedList<GeometricEdgeImpl>> adjacencyList = new Vector<LinkedList<GeometricEdgeImpl>>();

	/**
	 * Generation of the graph is done within the constructor TODO: Would have
	 * been better to separate the generation
	 * 
	 * @param totalNodes
	 *            - total nodes
	 * @param width
	 *            - width of the area nodes are generated
	 * @param height
	 *            - height of the area nodes are generated
	 * @param coverage
	 *            - communication range of a node
	 */
	public RandomGeometricGraphImpl(int totalNodes, int width, int height, int coverage) {

		// Generates random points within an area of width*height generates
		// nodes
		double x, y;
		for (int i = 0; i < totalNodes; i++) {
			x = (double) (Math.random() * width);
			y = (double) (Math.random() * height);
			GeometricNodeImpl node = new GeometricNodeImpl(x, y);
			node.setID(i);
			nodes.add(node);
		}

		// Adds the edges according to random geometric connectivity
		for (GeometricNodeImpl u : nodes) {
			for (GeometricNodeImpl v : nodes) {
				if (u.distanceTo(v) <= coverage) {
					// Puts the edge in the adjacency list
					GeometricEdgeImpl edge = new GeometricEdgeImpl(u, v);
					addEdge(edge);
				}
			}
		}

	}

	@Override
	public Set<Node> getNeighbors(Node u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Node> getNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Edge> getEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Adds an edge
	 * @param edge - edge to be added
	 */
	private void addEdge(Edge edge){
		//In this instance, an asymmetric undirected edge is inserted
		//Hence, nodes are added at both the end points of the edge 
		GeometricNodeImpl source=(GeometricNodeImpl)edge.getSource();
		GeometricNodeImpl target=(GeometricNodeImpl)edge.getTarget();

		
		//Checks if there exist a list at source node
		LinkedList<GeometricEdgeImpl> adjacencyAtSource=adjacencyList.get(source.getID());
		if(adjacencyAtSource!=null){
			adjacencyAtSource.add((GeometricEdgeImpl)edge);
		}else{
			adjacencyAtSource=new LinkedList<GeometricEdgeImpl>();
			adjacencyAtSource.add((GeometricEdgeImpl)edge);
		}
		
		//Checks if there exist a list at target node 
		LinkedList<GeometricEdgeImpl> adjacencyAtTarget=adjacencyList.get(target.getID());
		if(adjacencyAtTarget!=null){
			adjacencyAtTarget.add((GeometricEdgeImpl)edge);
		}else{
			adjacencyAtTarget=new LinkedList<GeometricEdgeImpl>();
			adjacencyAtTarget.add((GeometricEdgeImpl)edge);
		}
	}
}
