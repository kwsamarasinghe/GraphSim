package cui.tcs.graphsim.rest.resources;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Restlet;
import org.restlet.data.MediaType;

import com.tinkerpop.blueprints.util.io.graphml.GraphMLWriter;

import cui.tcs.graphsim.graph.ConnectivityGraph;

/**
 * 
 * @author Kasun Samarasinghe	
 *
 */
public class GraphResource{
	
	private Context context;
	
	public Restlet graph = new Restlet() {
		
		@Override
		public void handle(Request request, Response response){
			System.out.println("handling request");
			ConnectivityGraph graph=(ConnectivityGraph)context.getAttributes().get("graph");
			OutputStream output = null;
			GraphMLWriter writer = null;
			try {
				output = new ByteArrayOutputStream();
				writer = new GraphMLWriter(graph);
				writer.outputGraph(output);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			response.setEntity(output.toString(),MediaType.APPLICATION_ALL_XML);
		}
	};
	
	public Restlet graphUpdate = new Restlet() {
	
		@Override
		public void handle(Request request, Response response){
			response.setEntity("update",MediaType.APPLICATION_ALL);
		}
	};	
	
	public GraphResource(Context context){
		this.context=context;
	}
	
}
	