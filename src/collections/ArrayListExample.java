package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Joana");
		list1.add("Leeana");
		list1.add("Rahul");
		list1.add("Alex");
		list1.add("John");
		
		System.out.println("list value is : " + list1);
		System.out.println("List size is : " + list1.size());

		list1.remove(1);
		
		System.out.println("After removing 1st index from array list : " + list1);
		System.out.println("After removing 1st index value array list size is : " + list1.size());
		System.out.println("The data at 4th position is : " + list1.get(3));
		
		list1.set(0, "James");
		System.out.println("Updated list value : " + list1);
		
		list1.add(1, "Leeana");
		System.out.println("After adding !st index value : " + list1);
		
		Collections.sort(list1);
		System.out.println("After sorting the list is : " + list1);
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("List in Decending Order is : " + list1);
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		for(int i = 0; i < list1.size(); i++ ) {
			
			System.out.println("for loop : " + list1.get(i));
		}
		
		for(int i = 0; i < list1.size(); i++ ) {
			if(list1.get(i).equals("Leeana")) {
				System.out.println(i);
				break;
			}
		}
	}

}
