package java_practices;

import java.util.Scanner;

public class Circle {

	private static final double radius=7.5;
	private static final double length=8.5;
	private static final double width=5.5;
	public static void main(String[] args) {
		
		Circle circle=new Circle();
		//circle.AreaOfCircle();
		//circle.GetThreeNumbers();
		circle.AreaOfReactangle();
		

	}
	public void AreaOfCircle() {
		//Perimeter of circle
				double perimeter=2*Math.PI*radius;
				//Area of circle
				double area=Math.PI*radius*radius;
				System.out.println("Perimeter is "+perimeter);
				System.out.println("Area is "+area);
				
	}
	public void GetThreeNumbers() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First Number :");
		int num1=scanner.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2=scanner.nextInt();
		System.out.println("Enter the Third Number : ");
		int num3=scanner.nextInt();
		double avg=num1+num2+num3/3;
		System.out.println("Average = "+avg);
		
	}
	public void AreaOfReactangle() {
		double perimeter=2*(length+width);
		double area=length*width;
		System.out.println("Area is :" +area);
		System.out.println("Perimerter is :"+perimeter);
		
	}

}
