package cui.tcs.graphvisualizer;

import java.awt.Color;
import java.awt.geom.Point2D;

public class GraphPoint2D extends Point2D{

	private Color color = Color.BLACK;
	
	@Override
	public double getX() {
		return  getX();
	}

	@Override
	public double getY() {
		return getY();
	}

	public Color getColor(){
		return color;
	}
	
	@Override
	public void setLocation(double x, double y) {
		setLocation(x, y);
	}
	
	/**
	 * Sets the color of the point to be displayed
	 * @param color -  Color 
	 */
	public void setColor(Color color){
		this.color = color;
	}

}
