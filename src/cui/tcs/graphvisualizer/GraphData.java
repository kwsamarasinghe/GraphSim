package cui.tcs.graphvisualizer;

import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Set;
import java.util.Vector;

import cui.tcs.graph.NetworkGraph;
import cui.tcs.graph.Edge;
import cui.tcs.graph.Node;


public class GraphData {

	private NetworkGraph graph;
	
	public GraphData(NetworkGraph graph){
		this.graph = graph;
	}

	/**
	 * Return the vertices of the graph as points on 2D
	 * @return Vector<Point2D>
	 */
	public Vector<Point2D> getPoints(){
		Vector<Point2D> points=new Vector<Point2D>();
		Set<Node> vertices = graph.getVertices();
		for (Node vertex : vertices) {
			Point2D point = new Point2D.Double(vertex.getX(), vertex.getY());
			points.add(point);
		}
		
		return points;
	}
	
	/**
	 * Returns the edges of the graph as lines on 2D
	 * @return Vector<Line2D>
	 */
	public Vector<Line2D> getEdgeSegments(){
		Vector<Line2D> edgeSegments=new Vector<Line2D>();
		Set<Edge> edges = graph.getEdges();
		for(Edge edge: edges){
			Point2D p1 = new Point2D.Double(edge.getNodes()[0].getX(), edge.getNodes()[0].getY());
			Point2D p2 = new Point2D.Double(edge.getNodes()[1].getX(), edge.getNodes()[1].getY());
			Line2D edgeSegment= new Line2D.Double(p1, p2);
			edgeSegments.add(edgeSegment);
		}
		
		return edgeSegments;
	}
}
