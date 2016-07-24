package cui.tcs.graph;

import java.util.Set;

/**
 * Main interface of graph with basic connectivity graph operations
 * 
 * @author Kasun Samarasinghe
 *
 */
public interface ConnectivityGraph{
	
	/**
	 * Returns the set of nodes
	 * @return set of nodes
	 */
	public Set<Node> getNodes();
	
	/**
	 * Returns the set of edges
	 * @return set of edges
	 */
	public Set<Edge> getEdges();

	/**
	 * Returns the set of neighbors of a given node
	 * @param u node
	 * @return set of nodes
	 */
	public Set<Node> getNeighbors(Node u);
	

}
