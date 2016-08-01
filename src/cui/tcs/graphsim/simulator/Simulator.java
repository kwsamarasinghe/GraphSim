package cui.tcs.graphsim.simulator;

import cui.tcs.graphsim.graph.instances.geometric.RandomGeometricGraphImpl;
import cui.tcs.graphsim.rest.GraphServer;

public class Simulator{

	private RandomGeometricGraphImpl randomGeometricGraph;
	
	public Simulator(){
		randomGeometricGraph=new RandomGeometricGraphImpl(100, 50, 50, 10);
		
		//Starts the REST service
		GraphServer graphServer=new GraphServer(randomGeometricGraph);
		graphServer.start();
		
	}
	
	
	public static void main(String args[]){
		Simulator simulator=new Simulator();
	}

}


