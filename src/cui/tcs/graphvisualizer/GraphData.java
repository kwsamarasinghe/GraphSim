package cui.tcs.graphvisualizer;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.gephi.graph.api.Edge;
import org.gephi.graph.api.Node;

import cui.tcs.graph.NetworkGraph;
import cui.tcs.graph.EdgeImpl;
import cui.tcs.graph.NodeImpl;


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
		Iterator<Node> nodes =  graph.nodes();
		
		while(nodes.hasNext()){
			NodeImpl node=(NodeImpl)nodes.next();
			
			Point2D point = new Point2D.Double(node.x(), node.y());
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
		Iterator<Edge> edges =  graph.edges();
		
		while(edges.hasNext()){
			EdgeImpl edge=(EdgeImpl)edges.next();
						
			Point2D p1 = new Point2D.Double(edge.getSource().x(), edge.getTarget().y());
			Point2D p2 = new Point2D.Double(edge.getSource().x(), edge.getTarget().y());
			Line2D edgeSegment= new Line2D.Double(p1, p2);
			edgeSegments.add(edgeSegment);
		}
		
		return edgeSegments;
	}
}
