package cui.tcs.graph;


import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.gephi.graph.api.Node;
import org.gephi.graph.api.NodeIterable;
import org.gephi.graph.api.Edge;
import org.gephi.graph.api.EdgeIterable;
import org.gephi.graph.api.GraphModel;
import org.gephi.graph.api.GraphView;
import org.gephi.graph.api.Interval;
import org.gephi.graph.api.UndirectedGraph;
import org.gephi.graph.impl.GraphFactoryImpl;

/**
 * NetworkGraph class which is an extension of an undirected graph
 * @author Kasun Samarasinghe
 *
 * @param <V> Vertex
 * @param <E> Edge
 */
public abstract class NetworkGraph implements UndirectedGraph{
	
	//Total nodes
	protected int totalNodes;
	
	public NetworkGraph(int totalNodes){
		this.totalNodes=totalNodes;
	}
	
	/**
	 * This abstract method has to be implemented depending on the graph
	 * @param n number of nodes
	 */
	public abstract void generate();

	@Override
	public boolean addEdge(Edge edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addNode(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAllEdges(Collection<? extends Edge> edges) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAllNodes(Collection<? extends Node> nodes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEdge(Edge edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeNode(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAllEdges(Collection<? extends Edge> edges) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAllNodes(Collection<? extends Node> nodes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Edge edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node getNode(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNode(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Edge getEdge(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasEdge(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Edge getEdge(Node node1, Node node2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdgeIterable getEdges(Node node1, Node node2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Edge getEdge(Node node1, Node node2, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdgeIterable getEdges(Node node1, Node node2, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeIterable getNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdgeIterable getEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdgeIterable getSelfLoops() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeIterable getNeighbors(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeIterable getNeighbors(Node node, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdgeIterable getEdges(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdgeIterable getEdges(Node node, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNodeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEdgeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEdgeCount(int type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Node getOpposite(Node node, Edge edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDegree(Node node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isSelfLoop(Edge edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDirected(Edge edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAdjacent(Node node1, Node node2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAdjacent(Node node1, Node node2, int type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIncident(Edge edge1, Edge edge2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIncident(Node node, Edge edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clearEdges(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearEdges(Node node, int type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearEdges() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GraphView getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String key, double timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String key, Interval interval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttribute(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAttribute(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(String key, Object value, double timestamp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(String key, Object value, Interval interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAttribute(String key, double timestamp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAttribute(String key, Interval interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getAttributeKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraphModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDirected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUndirected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMixed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void readLock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readUnlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readUnlockAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeLock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeUnlock() {
		// TODO Auto-generated method stub
		
	}

	
	

}
