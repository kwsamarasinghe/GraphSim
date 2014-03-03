package cui.tcs.simulator;

import java.util.Vector;

import cui.tcs.aasp.AnchorManager;
import cui.tcs.graph.NetworkGraph;
import cui.tcs.graph.Node;
import cui.tcs.graphinstances.RandomGeometricGraph;
import cui.tcs.graphvisualizer.GraphData;
import cui.tcs.graphvisualizer.GraphPanel;
import cui.tcs.graphvisualizer.GraphVisualizer;
import cui.tcs.graph.Edge;

public class Simulator {

	public static void main(String args[]){
		
		// Generate the network with a random geometric graph
		RandomGeometricGraph rgg = new RandomGeometricGraph(Edge.class);
		rgg.generate(4000, 900, 900, 30);
		NetworkGraph ng = new NetworkGraph(rgg);
		
		//Anchor placement
		AnchorManager anchorManager = new AnchorManager(ng);
		anchorManager.placeAnchors();
		Vector<Node> anchors=anchorManager.getAnchors();
		
		//Visualize the graph
		GraphData  data = new GraphData(ng);
		GraphVisualizer visualizer = new GraphVisualizer(1000, 1000);
		GraphPanel panel = new GraphPanel(900, 900, data);
		visualizer.getContentPane().add(panel);
		visualizer.setVisible(true);
		
	}
}
