package cui.tcs.graphsim.graph.instances.geometric;

import java.util.HashMap;
import java.util.Set;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.util.io.graphml.GraphMLTokens;

/**
 * An edge for a geometric graph
 * 
 * @author Kasun Samarasinghe
 *
 */
public class GeometricEdgeImpl implements Edge{
	
	private int id;
	
	private double weight;
	
	/**
	 * Source and target nodes
	 */
	private GeometricNodeImpl source, target;

	/**
	 * Attribute map
	 */
	private final HashMap<String, Object> properties = new HashMap<>();
	
	
	public GeometricEdgeImpl(GeometricNodeImpl source, GeometricNodeImpl target) {
		this.source=source;
		this.target=target;
		
		weight=source.distanceTo(target);
	}
	
	/**
	 * Returns the source node
	 * @return source node
	 */
	public GeometricNodeImpl getSource(){
		return source;
	}
	
	/**
	 * Returns the target node
	 * @return target node
	 */
	public GeometricNodeImpl getTarget(){
		return target;
	}
	
	@Override
	public String getLabel() {
		Double distanceLable=new Double(weight);
		return distanceLable.toString();
	}

	@Override
	public Vertex getVertex(Direction direction) throws IllegalArgumentException {
		if(direction.equals(Direction.OUT)){
			return target;
		}else{
			return source;
		}
	}

	@Override
	public Object getId() {
		return id;
	}

	@Override
	public <T> T getProperty(String key) {
		return (T)properties.get(key);
	}

	@Override
	public Set<String> getPropertyKeys() {
		return properties.keySet();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}

	@Override
	public <T> T removeProperty(String key) {
		Object value=properties.get(key);
		return (T) value;
	}

	@Override
	public void setProperty(String key, Object value) {
		properties.put(key, value);
	}

}
