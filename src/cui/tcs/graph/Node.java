package cui.tcs.graph;


/**
 * Main interface for a node
 * @author Kasun Samarasinghe
 *
 */
public interface Node {

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
