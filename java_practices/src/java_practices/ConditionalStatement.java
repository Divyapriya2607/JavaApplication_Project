package java_practices;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		ConditionalStatement cs=new ConditionalStatement();
		//cs.FindPositiveORNegativeNumber();
		//cs.SolveQuadraticEqua();
		//cs.FindGreatestNumber();
		//cs.FindSmallAndLarge();
		//FindSmallAndLarge();
		//cs.FindWeekDayName();
		ToVerifyTwoFloatingValue();

	}
	public void FindPositiveORNegativeNumber() {
		Scanner inp=new Scanner(System.in);
		System.out.println("Input number :");
		int n=inp.nextInt();
		if(n>0) {
			System.out.println(n+" Number is Positive");
		}
		else if(n<0)
		{
			System.out.println(n+" Number is Negative");
		}
		else
		{
			System.out.println("Number is zero");
		}
	}
	public void SolveQuadraticEqua() {
		Scanner in=new Scanner(System.in);
		System.out.println("Input a : ");
		double a=in.nextDouble();
		System.out.println("Input b : ");
		double b=in.nextDouble();
		System.out.println("Input c: ");
		double c=in.nextDouble();
		double result=b*b-4*a*c;
		if(result>0.0) {
		double r1=(-b+Math.pow(result,0.5))/(2.0*a);
		double r2=(-b-Math.pow(result, 0.5))/(2.0*a);
		System.out.println("The roots are "+r1+" and "+r2);
		}
		else if(result==0.0) {
			double r1=-b/(2.0*a);
			System.out.println("The root is "+r1);
		}
		else {
			System.out.println("The equation has no roots");
		}
	}
	public void FindGreatestNumber() {
		Scanner in =new Scanner(System.in);
		System.out.println("Input the 1st number :");
		int n1=in.nextInt();
		System.out.println("Input the 2nd number :");
		int n2=in.nextInt();
		System.out.println("Input the 3rd number :");
		int n3=in.nextInt();
		if(n1>n2&&n1>n3) {
			System.out.println("The greatest number is "+n1);
		}else if(n2>n3) {
			System.out.println("The greatest number is "+n2);
		}
		else {
			System.out.println("The greatest number is "+n3);
		}
	}
	public static void FindSmallAndLarge() {
		Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
	public void FindWeekDayName() {
		Scanner in=new Scanner(System.in);
		System.out.println("Input Number");
		int weekNumber=in.nextInt();
		switch(weekNumber) 
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default :
			System.out.println("Invalid Number");
		}
	}
	public static void ToVerifyTwoFloatingValue() {
		Scanner in=new Scanner(System.in);
		System.out.println("Input 1st floating number");
		float f1=in.nextFloat();
		System.out.println("Input 2nd floating number");
		float f2=in.nextFloat();
		f1=Math.round(f1*1000);
		f1=f1/1000;
		f2=Math.round(f2*1000);
		f2=f2/1000;
		if(f1==f2) 
		{
			System.out.println(f1+" and "+f2+" both value are equal");
		}
		else
		{
			System.out.println(f1+" and "+f2+" both value are different");
		}
			
	}
	public static void ToFindNoOfDaysInMonth() {
		Scanner in=new Scanner(System.in);
		System.out.println("Input a month year");
		int month=in.nextInt();
		System.out.println("Input a year");
		int year=in.nextInt();
		int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";
		switch (month) {
		case 1:
			MonthOfName="January";
			number_Of_DaysInMonth=31;
			break;
		case 2:
			MonthOfName="February";
			if((year%400==0)||((year%4==0)&&(year%100!=0)))
			{
				number_Of_DaysInMonth=29;
			}
			else 
			{
				number_Of_DaysInMonth=28;	
			}
			break;
		case 3:
		{
			MonthOfName="March";
			number_Of_DaysInMonth=31;
			break;
		}
		case 4:
		{
			MonthOfName="April";
			number_Of_DaysInMonth=30;
			break;
		}
		case 5:
		{
			MonthOfName="May";
			number_Of_DaysInMonth=31;
			break;
		}
		case 6:
		{
			MonthOfName="June";
			number_Of_DaysInMonth=30;
			break;
		}
		case 7:
		{
			MonthOfName="July";
			number_Of_DaysInMonth=31;
			break;
		}
		case 8:
		{
			MonthOfName="August";
			number_Of_DaysInMonth=31;
			break;
		}
	}
}
}