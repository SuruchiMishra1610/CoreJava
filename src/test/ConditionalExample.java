package test;

public class ConditionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 17;
		if ( age >= 18) {
			System.out.println("I am eligible for voting");
		} else if ( age == 17) {
			System.out.println("Try next year voting");
		} else {
				System.out.println("Sorry, I'm not eligible");
			}
		
	}

}
