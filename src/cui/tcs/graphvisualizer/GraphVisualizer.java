package cui.tcs.graphvisualizer;

import javax.swing.JFrame;

public class GraphVisualizer extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public GraphVisualizer(int width, int height){
		setTitle("GraphViz");
		setSize((int) (1.2 * width), (int) (1.2 * height));
	}
}
