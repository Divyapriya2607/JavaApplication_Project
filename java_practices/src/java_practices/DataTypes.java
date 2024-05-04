package java_practices;

import java.util.Scanner;

public class DataTypes {
	private static double value=0.0254;
	public static void main(String[] args) {
		DataTypes datatype=new DataTypes();
		//datatype.ConvertDataType();
		//datatype.ConvertInchtoMeter();
		//datatype.AddAllDigits();
		//datatype.ConvertMinutesintoYears();
		datatype.TimeZone();
	}
	public void ConvertDataType() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input a degree in Fahrenheit :");
		double fahrenheit=scanner.nextDouble();
		//C=(5(F-32))/9
		//F=(9C+(32*5))/5
		double celcius=(5*(fahrenheit-32))/9;
		System.out.println(fahrenheit+" degree Fahrenhet is equal to "+celcius+" in Celcius");
		
	}
	public void ConvertInchtoMeter() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input a value for inch :");
		double inch=scanner.nextDouble();
		double meter=inch*0.0254;
		System.out.println(inch+" inch is "+meter+" meters");
	}
	public void AddAllDigits() {
		//565
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000 :");
		int num1=scanner.nextInt();
		int firstDigit=num1%10;
		int remainingNumber=num1/10;
		int secondDigit=remainingNumber%10;
		remainingNumber=remainingNumber/10;
		int thirdDigit=remainingNumber%10;
		remainingNumber=remainingNumber/10;
		int fourthDigit=remainingNumber%10;
		int sum=thirdDigit+secondDigit+thirdDigit+fourthDigit;
		System.out.println("The sum of all digits "+num1+" is "+sum);
		
	}
	//convert minutes into years and days.
	public void ConvertMinutesintoYears() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input the number of minutes:");
		double minutes=scanner.nextDouble();
		double minutesInYear=60*24*365;
		long year=(long)(minutes/minutesInYear);
		int days=(int)(minutes/60/24)%365;
		System.out.println((int)minutes+"minutes is approximately"+year+"years and "+days+"days");

	}
	//print the current time in GMT
	public void TimeZone() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input the time zone offset to GMT : ");
		long timeZoneChange=scanner.nextLong();
		long totalMilliSeconds=System.currentTimeMillis();
		long totalSeconds=totalMilliSeconds/1000;
		long currentSecond=totalSeconds%60;
		long totalMinutes=totalSeconds/60;
		long currentMinute=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currentHour=((totalHours+timeZoneChange)%24);
		System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond);
	}

}
