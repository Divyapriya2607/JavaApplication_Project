package inheritance;

class Vehicle{
	public void drive() {
		System.out.println("Reparing a vehicle");
	}
}
class Car extends Vehicle{
	public void drive() {
		System.out.println("Reparing a car");
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.drive();
		Car car=new Car();
		car.drive();
		

	}

}
