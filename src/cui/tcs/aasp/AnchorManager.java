package cui.tcs.aasp;

import java.util.Random;
import java.util.Vector;

import cui.tcs.graph.NetworkGraph;
import cui.tcs.graph.NodeImpl;
import cui.tcs.routing.Message;

/**
 * Simulates the anchor placement 
 * @author Kasun Samarasinghe
 *
 */
public class AnchorManager {

	private NetworkGraph networkgraph;
	
	private Vector<NodeImpl> anchors = new Vector<NodeImpl>();
	
	public AnchorManager(NetworkGraph ng) {
		this.networkgraph = ng;
	}
	
	public Vector<NodeImpl> getAnchors(){
		return anchors;
	}
	
	
	public void placeAnchors(){
		//Should pick a random anchor first to start the process
		Random rand = new Random();
		int anchorIndex=rand.nextInt(networkgraph.getVertices().size());
		NodeImpl rootAnchor = (NodeImpl)networkgraph.getVertices().toArray()[anchorIndex];
		anchors.add(rootAnchor);
		
		//First the root anchor performs a random walk of 20 hops to pick the second anchor
		Message message = new Message();
		message.setHeader("INITSEL");

		NodeImpl next = randomNeighbor(rootAnchor);
		rootAnchor.unicast(next, message);
		for(int i=0;i<19;i++){
			NodeImpl newNext = randomNeighbor(rootAnchor);
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
	private NodeImpl randomNeighbor(NodeImpl current){
		Vector<NodeImpl> neighbors = networkgraph.getNeighbors(current);
		Random rand = new Random();
		int neighborIndex = rand.nextInt(neighbors.size());
		NodeImpl randomNeighbor = (NodeImpl)neighbors.get(neighborIndex);
		return randomNeighbor;
	}

}
