package cui.tcs.graph;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.jgrapht.graph.SimpleGraph;

import cui.tcs.graph.Edge;
import cui.tcs.graph.Node;

public class NetworkGraph {

	/*
	 * Underlying graph on which the simulations are performed
	 */
	private SimpleGraph<Node, Edge> graph;
	
	public NetworkGraph(SimpleGraph<Node, Edge> graph){
		this.graph = graph;
	}
	
	public SimpleGraph<Node, Edge> getGraph(){
		return graph;
	}
	
	public Set<Node> getVertices(){
		return graph.vertexSet();
	}
	
	public Set<Edge> getEdges(){
		return graph.edgeSet();
	}
	
	public Vector<Node> getNeighbors(Node n){
		Set<Edge> edges = graph.edgesOf(n);
		Iterator<Edge> edgeIterator = edges.iterator();
		Vector<Node> neighbors = new Vector<Node>();
		while (edgeIterator.hasNext()) {
			Edge e = edgeIterator.next();
			if (e.getNodes()[0].equals(n)) {
				neighbors.add(e.getNodes()[1]);
			} else {
				neighbors.add(e.getNodes()[0]);
			}
		}
		
		return neighbors;
	}
	
}
