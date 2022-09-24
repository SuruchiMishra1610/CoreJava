package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emplyoee E1 = new Emplyoee();
		
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		E1.Display();
	
		
		Emplyoee E2 = new Emplyoee("Alex", 1001, "IT");
		E2.Display();
		
		Bank B1 = new Bank();
		B1.DisplayBalance();
		
		int Bal = B1.GetBalance();
		
		System.out.println("The Balance is : " + Bal);
		System.out.println("The Balance is : " + B1.GetBalance());
	
		BOABank B2 = new BOABank();
		B2.CCBalance();
		B1.DisplayBalance();
		
		// overloading Example
		OverLoadingExp overloading = new OverLoadingExp();
		
		int rectarea = overloading.GetArea(3,4);
		int sqrarea = overloading.GetArea(4);
		
		System.out.println("Rectangle Area is : " + rectarea);
		System.out.println("Square area is : " + sqrarea);
		
		//Overriding Example
		B1.CloseAccount(123456);
		B2.CloseAccount(5565555);
		
		Chrome Ch = new Chrome();
		Ch.OpenBrowser();
		
		Browser Br = new Chrome();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.Display();
		
		HondaCar H1 = new HondaCar();
		H1.start();
		
		CarInterface H2 = new HondaCar();
		H2.stop();
		
		// Encaptulation
		
		EncaptulationEx En = new EncaptulationEx();
		En.setBalance(4000);
		System.out.println(En.getBalance());
		
	}

}
