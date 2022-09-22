package test;

public class loopingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		while (num <= 10) {
			if (num == 6) {
				num = num + 2;
				continue;
				
			}else {
				System.out.println(num);
				num = num + 2;
			}
			System.out.println("Out of the while loop");
		}
		
	}

}
