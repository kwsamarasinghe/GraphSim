package cui.tcs.graphsim.engine;

import cui.tcs.graphsim.graph.instances.geometric.RandomGeometricGraphImpl;

public class Engine {

	/**
	 * Initializes the engine
	 */
	public void init() {
		// initializes the network
		RandomGeometricGraphImpl randomGeometricGraph = new RandomGeometricGraphImpl(100, 500, 500, 10);

	}
}
