package cui.tcs.graph.planargraphs;

import java.util.Iterator;

import org.gephi.graph.api.Node;

import cui.tcs.graph.NetworkGraph;
import cui.tcs.graph.NodeImpl;

/**
 * Planar Triangular graph or maximal planar graph
 * 
 * @author Kasun Samarasinghe
 *
 */
public class PlaneTriangularGraph extends NetworkGraph {

	public PlaneTriangularGraph(int n) {
		super(n);
	}

	/**
	 * Generates the planar triangular graph
	 */
	public void generate() {
		// Adds the nodes
		for (int i = 0; i < totalNodes; i++) {
			NodeImpl u = new NodeImpl();
			u.setAttribute("id", i);
			addNode(u);
		}

		// Adds the edges
		Iterator<Node> nodes = getNodes().iterator();
		
		while(nodes.hasNext()){
			NodeImpl node=(NodeImpl)nodes.next();
		}
		
	}

	/**
	 * Returns the number of nodes
	 * 
	 * @return total number of nodes
	 */
	public int getTotalNodes() {
		return totalNodes;
	}

}
