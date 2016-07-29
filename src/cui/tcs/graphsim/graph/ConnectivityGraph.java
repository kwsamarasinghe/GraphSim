package cui.tcs.graphsim.graph;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;

/**
 * Main interface of graph with basic connectivity graph operations
 * 
 * @author Kasun Samarasinghe
 *
 */
public interface ConnectivityGraph extends Graph{
	
	/**
	 * Returns the set of neighbors of a given node
	 * @param u node
	 * @return set of nodes
	 */
	public Iterable<Vertex> getNeighbors(Vertex u);
	

}
