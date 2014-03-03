package cui.tcs.graph;

import java.util.Vector;

import cui.tcs.routing.Message;
import cui.tcs.routing.Route;

public class Node {

	public int ID;
	
	private double x, y; 
	
	private NetworkGraph graph;
	
	private Vector<Route> routingTable = new Vector<Route>();
	private Vector<Message> buffer = new Vector<Message>();
	
	
	public Node(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setID(int id) {
		ID = id;
	}

	public int getID() {
		return ID;
	}

	public double getDistanceTo(Node node) {
		return Math.sqrt((x - node.getX()) * (x - node.getX()) + (y - node.getY())
				* (y - node.getY()));
	}
	
	public void inBuf(Message message){
		buffer.add(message);
	}
	
	public Message outBuf(){
		if(!buffer.isEmpty()){
			return buffer.get(0);
		}else{
			return null;
		}
	}
	
	/**
	 * Simulation of an unicast 
	 * @param node - Node from which the unicast is sent
	 * @param message - Unicast message sent
	 */
	public void unicast(Node node, Message message){
		node.inBuf(message);
	}
	
	/**
	 * Simulation of a broadcast 
	 * @param message - Broadcast message sent
	 */
	public void broadcast(Message message){
		Vector<Node> neighbors = graph.getNeighbors(this);
		for (Node node : neighbors) {
			unicast(node, message);
		}
	}
}
