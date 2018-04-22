import java.lang.StringBuffer;
import java.awt.Color;

public class Circle extends Shape{
	private double r;
	Circle(){
		super();
		this.r = 1;
	}
	Circle(Color color,int width,int r){
		super(color,width);
		this.r = r;
	}
	double getR(){
		return this.r;
	}
	void setR(double r){
		this.r = r;
	}
	public String toString(){
		StringBuffer ss = new StringBuffer();
		ss.append("Shape:Circle\n");
		ss.append("Color:" + color+"\n");
		ss.append("width" + width+"\n");
		ss.append("r" + r+"\n");
		for(Point p:points){
			ss.append(p);
		}
		return ss.toString();
	}
}