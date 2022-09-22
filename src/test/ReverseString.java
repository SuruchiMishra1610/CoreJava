package test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World";
		String result = "";
		for (int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			result = result + ch;
		}
		System.out.println("Reverse String is :" + result);
		
	}

}
