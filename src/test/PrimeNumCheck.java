package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12;
		boolean flag = true;
		
		for (int i = 2; i<num; i++) {
			int rem = num%i;
			if(rem == 0) {
				System.out.println("Num is not a prime number");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Num is a prime number");
		}
		
	}

}
