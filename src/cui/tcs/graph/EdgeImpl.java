package cui.tcs.graph;

import java.awt.Color;
import java.util.Map.Entry;
import java.util.Set;

import org.gephi.graph.api.Column;
import org.gephi.graph.api.ColumnIterable;
import org.gephi.graph.api.GraphView;
import org.gephi.graph.api.Interval;
import org.gephi.graph.api.Node;
import org.gephi.graph.api.Table;
import org.gephi.graph.api.TextProperties;

public class EdgeImpl implements org.gephi.graph.api.Edge{

	Node source;
	
	Node target;
	
	public EdgeImpl(NodeImpl source,NodeImpl target){
		this.source=source;
		this.target=target;
	}

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
		// TODO Auto-generated method stub
		
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
	public org.gephi.graph.api.Node getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.gephi.graph.api.Node getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getTypeLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getWeight(double arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWeight(Interval arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWeight(GraphView arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<Entry> getWeights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasDynamicWeight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDirected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSelfLoop() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setWeight(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWeight(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWeight(double arg0, Interval arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}