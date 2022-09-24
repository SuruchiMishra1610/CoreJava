package oops;

public class BOABank extends Bank {

	public int CreditCardNum;
	int AccountNum;
	
	public void CCBalance() {
		
		System.out.println("Inside CC Balance");
		this.CreditCardNum = 1002;
		super.AccountNum = 100;
		this.AccountNum = 200;
	
	}
	
	public void CloseAccount(int CCNumber) {
		
		System.out.println("Inside BOA Close Account");
	}
	
}
