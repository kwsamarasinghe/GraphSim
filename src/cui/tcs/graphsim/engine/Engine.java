package cui.tcs.graphsim.engine;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;

import cui.tcs.graphsim.graph.Node;

public class Engine {

	// Network graph
	private Graph graph;

	// Packet forwarder
	private PacketForwarder packetForwarder;

	/**
	 * @param graph - underlying graph
	 */
	public Engine(Graph graph) {
		this.graph = graph;
		// initializes the packet forwarder
		packetForwarder = new PacketForwarder(graph);
	}

	/**
	 * Start the engine
	 */
	public void start() {
		//Packet forwarder
		Thread packetForwarderThread=new Thread(packetForwarder);
		packetForwarderThread.start();
		
		// Initializes the node processes
		for (Vertex v : graph.getVertices()) {
			Node node = (Node) v;
			node.startProcess();
		}
	}

}
