package cui.tcs.graphsim.simulator;

import cui.tcs.graphsim.engine.Engine;
import cui.tcs.graphsim.graph.instances.geometric.RandomGeometricGraphImpl;
import cui.tcs.graphsim.rest.GraphServer;
import cui.tcs.graphsim.samples.SamplePacket;

public class Simulator {

	private GraphServer graphServer;

	private Engine engine;

	private RandomGeometricGraphImpl<SamplePacket> randomGeometricGraph;

	public Simulator() {
		randomGeometricGraph = new RandomGeometricGraphImpl<SamplePacket>(100, 50, 50, 10);
	}

	public void start() {
		// Starts the REST service
		graphServer = new GraphServer(randomGeometricGraph);
		graphServer.start();

		//Starts the engine
		Engine engine = new Engine(randomGeometricGraph);
		engine.start();

	}

	public void stop() {
		// Stops the server
		graphServer.stop();
	}

	public static void main(String args[]) {
		Simulator simulator = new Simulator();
		simulator.start();
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				simulator.stop();
			}
		});
	}

}
