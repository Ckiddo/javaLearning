import java.lang.Math;
import java.lang.StringBuffer;


public class Point{ // 点类
	private double x,y; 

	public String toString(){
		return new StringBuffer().append("Point:\nx:").append(x).append("\ny:").append(y).append("\n").toString();
	}
	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}

	void move(double dx,double dy){ // 移动
		this.x += dx;
		this.y += dy;
	}

	void rotate(double alpha){ // 逆时针旋转
		this.x = (this.x * Math.cos(alpha) - this.y * Math.sin(alpha));
		this.y = (this.x * Math.cos(alpha) + this.y * Math.cos(alpha)); 
	}
}