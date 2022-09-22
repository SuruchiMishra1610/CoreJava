package test;

public class VowelCheckUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				   count++;
				   break;
		}
	}
		System.out.println("The Vowel count is : " + count);
		
	}

}
