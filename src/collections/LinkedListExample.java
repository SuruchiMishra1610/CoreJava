package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Joana");
		list1.add("Leeana");
		list1.add("Rahul");
		list1.add("Alex");
		list1.add("John");
		
		System.out.println("Linked list content is : " + list1);
		System.out.println("Linked List size is : " + list1.size());
	}

}
