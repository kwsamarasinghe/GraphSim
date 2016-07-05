package cui.tcs.simulator;

import cui.tcs.graph.planargraphs.PlaneTriangularGraph;
import cui.tcs.graphinstances.RandomGeometricGraph;
import cui.tcs.graphvisualizer.GraphData;
import cui.tcs.graphvisualizer.GraphPanel;
import cui.tcs.graphvisualizer.GraphVisualizer;

public class Simulator {

	public static void main(String args[]){
		
		// Generate the network with a random geometric graph
		RandomGeometricGraph rgg=new RandomGeometricGraph(100,200,200,50);
		rgg.generate();
		
		//Visualizer
		GraphVisualizer graphVizualizer=new GraphVisualizer(200, 200);
		GraphData graphData=new GraphData(rgg);
		
		GraphPanel graphPanel = new GraphPanel(200, 200, graphData);
		graphVizualizer.add(graphPanel);
		graphVizualizer.setVisible(true);
		
	}
}
