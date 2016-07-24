package cui.tcs.graph.instances.geometric;

import java.util.HashMap;

import cui.tcs.graph.Edge;
import cui.tcs.graph.Node;

/**
 * An edge for a geometric graph
 * 
 * @author Kasun Samarasinghe
 *
 */
public class GeometricEdgeImpl implements Edge{
	
	/**
	 * Source and target nodes
	 */
	private GeometricNodeImpl source, target;

	/**
	 * Attribute map
	 */
	private final HashMap<String, String> attributes = new HashMap<>();
	
	
	public GeometricEdgeImpl(GeometricNodeImpl source, GeometricNodeImpl target) {
		this.source=source;
		this.target=target;
	}
	
	@Override
	public void setSource(Node source) {
		this.source = (GeometricNodeImpl) source;
	}

	@Override
	public void setTarget(Node target) {
		this.target = (GeometricNodeImpl) target;
	}

	@Override
	public Node getSource() {
		return (Node) source;
	}

	@Override
	public Node getTarget() {
		return (Node) target;
	}

	@Override
	public void setAttribute(String key, String value) {
		attributes.put(key, value);
	}

	@Override
	public Object getAttribute(String key) {
		return attributes.get(key);
	}

}
