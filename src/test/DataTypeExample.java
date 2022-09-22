package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 40;
		int num2 = 20;
		
		int sum = num1 + num2;
		int mul = num1 * num2;
		float div = (float) num1 / num2;
		
		System.out.println("Sum of two numbers is : " + sum);
		System.out.println("multiplication of two numbers is :" + mul);
		System.out.println("Division of two number is :" + div);
		
		String str1 = "Clean world Green World";
		System.out.println(str1);
		
		char ch1 = str1.charAt(0);
		System.out.println("The length of the string is : " + str1.length());
		System.out.println("First Character is " + ch1);
		
		char chn = str1.charAt(str1.length()-1);
		System.out.println("Lat character value in str1 : " + chn);
		
		System.out.println(" String in Upper case : " + str1.toUpperCase());
		System.out.println("String in lower case : " + str1.toLowerCase());
	}

}
