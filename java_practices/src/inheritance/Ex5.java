package inheritance;

class Person{
	private String firstName;
	private String lastName;
	public Person(String fName,String lName) {
		this.firstName=fName;
		this.lastName=lName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
class Staff extends Person{
	private int employeeID;
	private String jobTitle;
	public Staff(String firstName,String lastName,int empID,String jobTitle) {
		super(firstName,lastName);
		this.employeeID=empID;
		this.jobTitle=jobTitle;
	}
	public int getEmployeeId() {
				return employeeID;
	}
	public String getLastName() {
		return super.getLastName()+","+jobTitle;
		
	}
}

public class Ex5 {

	public static void main(String[] args) {
		Staff employee=new Staff("Divya","Priya",1001,"Software Test Engineer");
		System.out.println(employee.getFirstName()+" "+employee.getLastName()+"("+employee.getEmployeeId()+")");
	}

}
