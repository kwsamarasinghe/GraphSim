package cui.tcs.graph;

import java.awt.Color;
import java.util.Map.Entry;
import java.util.Set;

import org.gephi.graph.api.Column;
import org.gephi.graph.api.ColumnIterable;
import org.gephi.graph.api.GraphView;
import org.gephi.graph.api.Interval;
import org.gephi.graph.api.Table;
import org.gephi.graph.api.TextProperties;
import org.gephi.graph.spi.LayoutData;


public class NodeImpl implements org.gephi.graph.api.Node{

	//Coordinates
	private float x,y;
	
	
	@Override
	public boolean addInterval(Interval arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addTimestamp(double arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clearAttributes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(Column arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String arg0, double arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(Column arg0, double arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String arg0, Interval arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(Column arg0, Interval arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String arg0, GraphView arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(Column arg0, GraphView arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ColumnIterable getAttributeColumns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getAttributeKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Entry> getAttributes(Column arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interval[] getIntervals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStoreId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Table getTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] getTimestamps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasInterval(Interval arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTimestamp(double arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(Column arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(String arg0, double arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(Column arg0, double arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(String arg0, Interval arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(Column arg0, Interval arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeInterval(Interval arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeTimestamp(double arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAttribute(String arg0, Object arg1) {
		setAttribute(arg0, arg1);
	}

	@Override
	public void setAttribute(Column arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(String arg0, Object arg1, double arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(Column arg0, Object arg1, double arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(String arg0, Object arg1, Interval arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(Column arg0, Object arg1, Interval arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLabel(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float alpha() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float b() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float g() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRGBA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TextProperties getTextProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float r() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAlpha(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setB(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor(Color arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setG(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setR(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T extends LayoutData> T getLayoutData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFixed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFixed(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLayoutData(LayoutData arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition(float arg0, float arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition(float arg0, float arg1, float arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setX(float arg0) {
		this.x=arg0;
	}

	@Override
	public void setY(float arg0) {
		this.y=arg0;
	}

	@Override
	public void setZ(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float x() {
		return x;
	}

	@Override
	public float y() {
		return y;
	}

	@Override
	public float z() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
	
	
}
