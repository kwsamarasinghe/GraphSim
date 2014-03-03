package cui.tcs.graphvisualizer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Vector;

import javax.swing.JPanel;


public class GraphPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private GraphData graphData;
	
	public GraphPanel(int width, int height, GraphData graphData){
		setSize(width,height);
		if(graphData != null){
			this.graphData = graphData;
		}
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Paints edges
		Vector<Line2D> edgeSegments = graphData.getEdgeSegments();
		for (Line2D line2d : edgeSegments) {
			paintEdge(g, line2d, Color.GRAY);
		}
		
		//Paints vertices
		Vector<Point2D> vertexPoints = graphData.getPoints();
		for (Point2D point2d : vertexPoints) {
			paintPoint(g, point2d, Color.BLACK);
		}
	}
	
	private void paintPoint(Graphics g, Point2D p, Color color) {
		g.setColor(color);
		g.fillOval((int) p.getX(), (int) p.getY(), 8, 8);
	}
	
	private void paintEdge(Graphics g, Line2D l, Color color){
		g.setColor(color);
		g.drawLine((int)l.getP1().getX(), (int)l.getP1().getY(), (int)l.getP2().getX(), (int)l.getP2().getY());
	}
}
