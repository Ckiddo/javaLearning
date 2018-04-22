import java.awt.Color;
import java.util.Vector;
import java.lang.StringBuffer;

public class Shape{
	protected Color color;
	protected int width;
	protected Vector<Point> points = new Vector<Point>();

	Shape(){
		color = Color.black;
		width = 2;
	}
	Shape(Color color,int width){
		this.color = color;
		this.width = width;
	}
	Color getColor(){
		return this.color;
	}
	void setColor(Color color){
		this.color = color;
	}
	int getWidth(){
		return this.width;
	}
	void setWidth(int width){
		this.width = width;
	}

	void move(double dx,double dy){
		for(Point p : points){
			p.move(dx,dy);
		}
	}

	void rotate(double alpha){
		for(Point p:points){
			p.rotate(alpha);
		}
	}
	public String toString(){
		StringBuffer ss = new StringBuffer();
		ss.append("Shape:shape\n");
		ss.append("Color:" + color+"\n");
		ss.append("width" + width+"\n");
		for(Point p:points){
			ss.append(p);
		}
		return ss.toString();
	}
}