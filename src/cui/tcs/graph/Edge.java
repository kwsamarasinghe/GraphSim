package cui.tcs.graph;

/**
 * Main interface of an edge
 * 
 * @author Kasun Samarasinghe
 *
 */
public interface Edge {
	
	/**
	 * @param source -  source node
	 */
	public void setSource(Node source);
	
	/**
	 * @param target -  target node
	 */
	public void setTarget(Node target);
	
	/**
	 * @return - source node
	 */
	public Node getSource();

	/**
	 * @return - target node
	 */
	public Node getTarget();
	
	/**
	 * Sets an attribute
	 * @param key key of the attribute
	 * @param value value of the attribute
	 */
	public void setAttribute(String key, String value);
	
	/**
	 * Reads an attribute
	 * @param key key of the attribute
	 * @return attribute with the given key
	 */
	public Object getAttribute(String key);
}