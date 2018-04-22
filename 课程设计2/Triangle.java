import java.lang.StringBuffer;
import java.awt.Color;

public class Triangle extends Shape{
	Triangle(){
		super();
		points.add(new Point(0,0));
		points.add(new Point(0,1));
		points.add(new Point(1,0));
	}
	Triangle(Color color,int width,double x1,double y1,double x2,double y2,double x3,double y3){
		super(color,width);
		points.add(new Point(x1,y1));
		points.add(new Point(x2,y2));
		points.add(new Point(x3,y3));
	}
	void setRectangle(Color color,int width,double x1,double y1,double x2,double y2,double x3,double y3){
		this.color = color;
		this.width = width;
		points.add(0,new Point(x1,y1));
		points.add(1,new Point(x2,y2));
		points.add(2,new Point(x3,y3));
	}
	public String toString(){
		StringBuffer ss = new StringBuffer();
		ss.append("Shape:Rectangle\n");
		ss.append("Color:" + color+"\n");
		ss.append("width" + width+"\n");
		for(Point p:points){
			ss.append(p);
		}
		return ss.toString();
	}
}