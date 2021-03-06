import java.lang.StringBuffer;
import java.awt.Color;

public class Rectangle extends Shape{
	Rectangle(){
		super();
		points.add(new Point(0,0));
		points.add(new Point(1,1));
	}
	Rectangle(Color color,int width,int x1,int y1,int x2,int y2){
		super(color,width);
		points.add(new Point(x1,y1));
		points.add(new Point(x2,y2));
	}
	void setRectangle(Color color,int width,int x1,int y1,int x2,int y2){
		this.color = color;
		this.width = width;
		points.add(0,new Point(x1,y1));
		points.add(1,new Point(x2,y2));
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
