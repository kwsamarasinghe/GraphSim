package cui.tcs.graphsim.rest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.tinkerpop.blueprints.util.io.graphml.GraphMLWriter;

import cui.tcs.graphsim.graph.ConnectivityGraph;

public class GraphResource extends ServerResource{
	
	@Get
	public String hello(){
		ConnectivityGraph graph=(ConnectivityGraph)getContext().getAttributes().get("graph");
		OutputStream output = null;
		try {
			output = new ByteArrayOutputStream();
			GraphMLWriter writer = new GraphMLWriter(graph);
			writer.outputGraph(output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return output.toString();
	}
}
