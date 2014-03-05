package cui.tcs.graphvisualizer;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class GraphLine2D extends Line2D{

	private Color color = Color.GRAY;

	@Override
	public Rectangle2D getBounds2D() {
		return getBounds2D();
	}

	@Override
	public Point2D getP1() {
		return getP1();
	}

	@Override
	public Point2D getP2() {
		return getP2();
	}

	@Override
	public double getX1() {
		return getX1();
	}

	@Override
	public double getX2() {
		return getX2();
	}

	@Override
	public double getY1() {
		return getY1();
	}

	@Override
	public double getY2() {
		return getY2();
	}

	public Color getColor(){
		return color;
	}
	
	@Override
	public void setLine(double x1, double y1, double x2, double y2) {
		setLine(x1, y1, x2, y2);
	}
	
	public void setColor(Color color){
		this.color = color;
	}
}
