package cui.tcs.graphinstances;

import java.util.Set;

import org.jgrapht.graph.SimpleGraph;

import cui.tcs.graph.Edge;
import cui.tcs.graph.Node;

public class RandomGeometricGraph extends SimpleGraph<Node, Edge>{

	private static final long serialVersionUID = 6632027566668199940L;
	private int coverageUnit=50;
	
	public RandomGeometricGraph(Class<? extends Edge> edgeClass) {
		super(edgeClass);
	}

	//Initializes the random nodes and edges 
	public void generate(int totalNodes,int areaWidth, int areaHeight, int coverage){
		coverageUnit = coverage;
		
		int x,y;
		for(int i=0;i<totalNodes;i++){
			x = (int) (Math.random() * areaWidth);
			y = (int) (Math.random() * areaHeight);
			Node n = new Node(x,y);
			n.setID(i);
			addVertex(n);
		}
		
		//Adds the edges according to random geometric connectivity
		Object[] nodes = vertexSet().toArray();
		for(int j=0;j<nodes.length;j++){
			for(int k=0;k<nodes.length;k++){
				Node u = (Node)nodes[j];
				Node v = (Node)nodes[k];
				if(!u.equals(v)){
					if(u.getDistanceTo(v)<=coverageUnit){
						if(Math.random()<0.5){
							addEdge(u, v,new Edge(u, v, u.getDistanceTo(v)));
							addEdge(v, u,new Edge(v, u, u.getDistanceTo(v)));
						}
					}
				}
			}
		}
	}
	
	public Set<Node> getNodes(){
		return vertexSet();
	}
	
	public Set<Edge> getEdges(){
		return edgeSet();
	}
}

