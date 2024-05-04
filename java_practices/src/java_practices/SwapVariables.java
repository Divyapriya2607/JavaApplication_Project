package java_practices;

import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		SwapVariables swap=new SwapVariables();
		swap.Swapping();

	}
	public void Swapping() {
		int a=6,b=5,c;
		c=a;
		a=b;
		b=c;
		System.out.println("A"+a);
		System.out.println("B"+b);	
	}
	public void SumBinaryNumbers() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input first binary number :");
		int firstNumber=scanner.nextInt();
		System.out.println("Input second binary number :");
		int secondNumber=scanner.nextInt();
		System.out.println();
	}

}
