package cui.tcs.aasp;

import java.util.Random;
import java.util.Vector;

import cui.tcs.graph.NetworkGraph;
import cui.tcs.graph.Node;
import cui.tcs.routing.Message;

/**
 * Simulates the anchor placement 
 * @author Kasun Samarasinghe
 *
 */
public class AnchorManager {

	private NetworkGraph networkgraph;
	
	private Vector<Node> anchors = new Vector<Node>();
	
	public AnchorManager(NetworkGraph ng) {
		this.networkgraph = ng;
	}
	
	public Vector<Node> getAnchors(){
		return anchors;
	}
	
	
	public void placeAnchors(){
		//Should pick a random anchor first to start the process
		Random rand = new Random();
		int anchorIndex=rand.nextInt()%networkgraph.getVertices().size();
		Node rootAnchor = (Node)networkgraph.getVertices().toArray()[anchorIndex];
		anchors.add(rootAnchor);
		
		//First the root anchor performs a random walk of 20 hops to pick the second anchor
		Message message = new Message();
		message.setHeader("INITSEL");

		Node next = randomNeighbor(rootAnchor);
		rootAnchor.unicast(next, message);
		for(int i=0;i<19;i++){
			Node newNext = randomNeighbor(rootAnchor);
			next.unicast(newNext,message);
			next = newNext;
		}
		
		//Second anchor selected
		anchors.add(next);
		
	
	}
	
	/**
	 * Returns a random neighbor of the current node
	 * @param current - current node
	 * @return Neighbor node randomly picked from the neighbor list
	 */
	private Node randomNeighbor(Node current){
		Vector<Node> neighbors = networkgraph.getNeighbors(current);
		Random rand = new Random();
		Node randomNeighbor = (Node)neighbors.get(rand.nextInt()%neighbors.size());
		return randomNeighbor;
	}

}
