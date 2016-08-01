package cui.tcs.graphsim.rest;

import org.restlet.Component;
import org.restlet.data.Protocol;

import cui.tcs.graphsim.graph.ConnectivityGraph;

public class GraphServer  {

	private ConnectivityGraph graph;

	public GraphServer(ConnectivityGraph graph) {
		this.graph = graph;
	}

	public boolean start() {
		try {
			Component component = new Component();
			component.getServers().add(Protocol.HTTP, 8111);
			component.getDefaultHost().attach("/graph", new GraphRouter(graph));
			component.start();
			System.out.println("HTTP Listner started successfully");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
