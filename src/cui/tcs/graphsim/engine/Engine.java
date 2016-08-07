package cui.tcs.graphsim.engine;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;

import cui.tcs.graphsim.samples.RandomWalkProcess;

/**
 * Simulation engine which is the main class of the simulation
 * 
 * @author kasun
 *
 */
public class Engine {

	// Packet forwarder
	private PacketForwarder packetForwarder;

	// Simulation context
	private SimulationContext simulationContext;

	/**
	 * @param graph - underlying graph
	 */
	public Engine(Graph graph) {
		// initializes the packet forwarder
		packetForwarder = new PacketForwarder(graph);
		
		//Initializes the context
		simulationContext = new SimulationContext(packetForwarder);
		
		//Initializes the node processes and register them in the context
		for(Vertex node: graph.getVertices()){
			NodeProcess nodeProcess=new RandomWalkProcess(node);
			simulationContext.registerNodeProcess((int)node.getId(), nodeProcess);
		}
	}

	/**
	 * Start the engine
	 */
	public void start() {
		// Packet forwarder
		Thread packetForwarderThread = new Thread(packetForwarder);
		packetForwarderThread.start();

		// Starts the node processes
		for (NodeProcess process : simulationContext.getNodeProcesses()) {
			Thread nodeProcessThread = new Thread(process);
			nodeProcessThread.start();
		}
	}

	public SimulationContext getContext() {
		return simulationContext;
	}

}
