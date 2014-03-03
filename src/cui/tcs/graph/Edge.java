package cui.tcs.graph;

public class Edge {

	private double weight = 0;
	private Node nodes[] = new Node[2];

	public Edge(Node n1, Node n2, double w) {
		nodes[0] = n1;
		nodes[1] = n2;
		weight = w;
	}

	public Node[] getNodes() {
		return nodes;
	}

	public double getWeight() {
		return weight;
	}
}