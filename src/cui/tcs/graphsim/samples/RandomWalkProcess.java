package cui.tcs.graphsim.samples;

import org.apache.commons.logging.impl.Log4JLogger;

import cui.tcs.graphsim.engine.NodeProcess;
import cui.tcs.graphsim.engine.Packet;
import cui.tcs.graphsim.graph.Node;

public class RandomWalkProcess implements NodeProcess {

	private Node node;

	private Log4JLogger logger = new Log4JLogger();

	/**
	 * Sets the node
	 * 
	 * @param node
	 */
	public void setNode(Node node) {
		this.node = node;
	}

	/**
	 * Node process
	 */
	public void run() {
		logger.debug("Starting the node process");
		if (node == null) {
			logger.debug("A node must be associated with the node process");
			System.exit(1);
		} else {

			// sample process which generates a packet and performs a random
			// walk
			System.out.println("Starting process ");
			if ((int) node.getId() == 0) {
				
			}
		}
	}

	public void handlePacket(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Receiving a packet from " + packet.getSource() + " to" + packet.getDestination());

	}

}
