package cui.tcs.graphsim.engine;

/**
 * Node process which has to be implemented by the respective node
 * @author Kasun Samarasinghe
 *
 * @param <P> packet
 */
public interface NodeProcess<P> extends Runnable{

	/**
	 * Handles the incoming packet to this node
	 * @param packet
	 */
	public void handlePacket(P packet);
}

