package cui.tcs.graphsim.rest;

import org.apache.commons.logging.impl.Log4JLogger;
import org.restlet.Component;
import org.restlet.data.Protocol;

import cui.tcs.graphsim.graph.ConnectivityGraph;

public class GraphServer  {

	//Graph
	private ConnectivityGraph graph;

	//REST component
	private Component component;
	
	private Log4JLogger logger;
	
	public GraphServer(ConnectivityGraph graph) {
		this.graph = graph;
		logger=new Log4JLogger();
	}

	public boolean start() {
		try {
			component = new Component();
			component.getServers().add(Protocol.HTTP, 8111);
			component.getDefaultHost().attach("/graph", new GraphRouter(graph));
			component.start();
			logger.debug("graph Server Started on port 8111");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean stop(){
		try {
			component.stop();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
