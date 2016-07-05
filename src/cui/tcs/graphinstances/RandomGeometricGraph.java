package cui.tcs.graphinstances;

import java.util.Iterator;

import org.gephi.graph.api.Node;

import cui.tcs.graph.EdgeImpl;
import cui.tcs.graph.NetworkGraph;
import cui.tcs.graph.NodeImpl;

public class RandomGeometricGraph extends NetworkGraph{

	// Coverage unit for the random geometric graph
	private int coverage=50;
	
	// Width of the area of node distribution
	private int width;
	
	// Height of the area of the node distribution
	private int height;
	
	public RandomGeometricGraph(int totalNodes, int width, int height, int coverage) {
		super(totalNodes);
		this.width=width;
		this.height=height;
		this.coverage=coverage;
	}

	//Initializes the random nodes and edges 
	public void generate(){
		float x,y;
		for(int i=0;i<totalNodes;i++){
			x = (float) (Math.random() * width);
			y = (float) (Math.random() * height);
			NodeImpl node = new NodeImpl();
			node.setX(x);
			node.setY(y);
			addNode(node);
		}
		
		//Adds the edges according to random geometric connectivity
		Iterator<Node> nodes=nodes();
		Iterator<Node> nodes_=nodes();
		
		while(nodes.hasNext()){
			NodeImpl u=(NodeImpl)nodes.next();
			while(nodes_.hasNext()){
				NodeImpl v=(NodeImpl)nodes_.next();
				if(getDistance(u, v)<=coverage){
					EdgeImpl e=new EdgeImpl(u, v);
					addEdge(e);
				}
			}
		}
	}
	
	
	private double getDistance(NodeImpl u, NodeImpl v){
		float x1=u.x();
		float y1=u.y();
		
		float x2=v.x();
		float y2=v.y();
		
		double d=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		return (float)d;
	}
}

