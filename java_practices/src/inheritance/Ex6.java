package inheritance;

class Size{
	public double getPerimeter() {
		return 0.0;
	}
	public double getArea() {
		return 0.0;
	}
}
class Circle extends Size{
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Ex6 {

	public static void main(String args[]) {
		Circle circle=new Circle(8.1);
		System.out.println(circle.getPerimeter());
		System.out.println(circle.getArea());
	}
}
