import java.util.Scanner;
import java.util.Vector;
import java.awt.Color;

public class TestShape{
	public static void main(String args[]){
		Vector<Shape> vec = new Vector<Shape>();
		vec.add(new Shape(Color.black,2));
		vec.add((Shape)new Line(Color.black,2,3,3,9,9));
		vec.add((Shape)new Circle());
		vec.add((Shape)new Rectangle(Color.black,2,3,3,9,9));
		vec.add((Shape)new Triangle());
		System.out.println("打印各个图像信息：");
		for(Shape sh :vec){
			System.out.println(sh);
		}
		System.out.println("平移各图形并打印信息：");
		for(Shape sh :vec){
			sh.move(1,1);
			System.out.println(sh);
		}
		System.out.println("旋转各图形并打印信息：");
		for(Shape sh :vec){
			sh.rotate(3.14/4);
			System.out.println(sh);
		}
	}
}