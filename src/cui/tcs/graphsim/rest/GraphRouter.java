package cui.tcs.graphsim.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import cui.tcs.graphsim.graph.ConnectivityGraph;

public class GraphRouter extends Application {
	
	private ConnectivityGraph graph;
	
	public GraphRouter(ConnectivityGraph graph) {
		this.graph=graph;
	}
	
	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());
		router.getContext().getAttributes().put("graph", graph);
		router.attach("/graph", GraphResource.class);
		return router;
	}
}
