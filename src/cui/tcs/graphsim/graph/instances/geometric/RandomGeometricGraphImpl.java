package cui.tcs.graphsim.graph.instances.geometric;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Features;
import com.tinkerpop.blueprints.GraphQuery;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.util.io.graphml.GraphMLWriter;

import cui.tcs.graphsim.graph.ConnectivityGraph;

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
	private final LinkedList<Vertex> nodes = new LinkedList<Vertex>();

	/**
	 * Set of edges
	 */
	private final LinkedList<Edge> edges = new LinkedList<Edge>();

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
			node.setProperty("x", x);
			node.setProperty("y", y);
			nodes.add(node);
		}

		// Adds the edges according to random geometric connectivity
		for (Vertex u : nodes) {
			for (Vertex v : nodes) {
				if (!u.equals(v)) {
					if (((GeometricNodeImpl) u).distanceTo((GeometricNodeImpl) v) <= coverage) {
						// Puts the edge in the adjacency list
						GeometricEdgeImpl edge = new GeometricEdgeImpl((GeometricNodeImpl) u, (GeometricNodeImpl) v);
						addEdge(edge, u, v, null);
					}
				}
			}
		}

	}

	/**
	 * Returns the neighbors of u
	 * 
	 * @param u
	 * @return neighbors of u
	 */
	public Iterable<Vertex> getNeighbors(Vertex u) {
		return u.getVertices(null, null);
	}

	/**
	 * Adds an edge
	 * 
	 * @param edge
	 * @param source
	 * @param target
	 * @param edgeLable
	 * @return Edge
	 */
	public Edge addEdge(Object edge, Vertex source, Vertex target, String edgeLable) {
		// In this instance, an symmetric undirected edge is inserted
		// Hence, nodes are added at both the end points of the edge
		GeometricNodeImpl u = (GeometricNodeImpl) source;
		GeometricNodeImpl v = (GeometricNodeImpl) target;

		// Adds v to u's neighbors
		u.addEdge(u.getID() + "" + v.getID(), v);

		// Adds v to u's neighbors
		v.addEdge(v.getID() + "" + u.getID(), u);

		// Adds the edge to the edge list
		edges.add((GeometricEdgeImpl) edge);

		return (Edge) edge;
	}

	/**
	 * Adds a new vertex
	 * 
	 * @param vertex
	 * @return new vertex
	 */
	public Vertex addVertex(Object vertex) {
		GeometricNodeImpl newVertex = (GeometricNodeImpl) vertex;
		nodes.add(newVertex);
		return newVertex;
	}

	@Override
	public Edge getEdge(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Edge> getEdges(String arg0, Object arg1) {
		return edges;
	}

	@Override
	public Features getFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * O(n) time node search
	 * 
	 * @param u
	 * @return
	 */
	public Vertex getVertex(Object u) {
		for (Vertex v : nodes) {
			if (v.equals(u)) {
				return v;
			}
		}

		return null;
	}

	@Override
	public Iterable<Vertex> getVertices() {
		return nodes;
	}

	@Override
	public Iterable<Vertex> getVertices(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraphQuery query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEdge(Edge arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeVertex(Vertex arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
	}

	@Override
	public Iterable<Edge> getEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	public void writeGraphML() {
		try {
			OutputStream output = new BufferedOutputStream(new FileOutputStream("rgg.xml"));
			GraphMLWriter writer = new GraphMLWriter(this);
			writer.outputGraph(output);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
