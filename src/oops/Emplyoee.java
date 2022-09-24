package oops;

public class Emplyoee {

	public String Name;
	public int EmpId;
	public String Department;
	
	public Emplyoee() {
		
		System.out.println("Inside default Constructor");
	}
	
	public Emplyoee(String P1,int P2,String P3) {
		
		Name = P1;
		EmpId = P2;
		Department = P3;
		
	}
	
	public void Display() {
		
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Department);
	}
	
}
