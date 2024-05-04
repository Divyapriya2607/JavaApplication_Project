package inheritance;

class Shape{
	public double getArea() {
		return 0.0;
	}
}
class Rectangle {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public double getArea() {
		double area=length*width;
		System.out.println("Area of Rectangle "+ area);
		return area;
		
	}
}
public class Ex3 {

	public static void main(String[] args) {
		Shape shape=new Shape();
		Rectangle rectangle=new Rectangle(4.0,5.0);
		//shape.getArea();
		rectangle.getArea();
		 
		}
}
