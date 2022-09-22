package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {10, 20, 30, 40, 50};
		
		System.out.println("Total numbers in array is : " + array1.length);
		System.out.println("2nd index value in array is : " + array1[1]);
		System.out.println("Last index value in array is : " + array1[array1.length-1]);
		
		
		String str1 = "Clean World Green World";
		String[] array2 = str1.split(" ");
		System.out.println("First word is " + array2[0]);
		System.out.println("Last word is : " + array2[array2.length-1]);
		

	}

}
