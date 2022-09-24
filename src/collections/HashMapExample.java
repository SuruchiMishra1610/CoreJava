package collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Matt");
		map1.put(2, "Kate");
		map1.put(3, "John");
		map1.put(4, "Leeana");
		map1.put(100, "Test");
		
		System.out.println(map1);
		System.out.println("Data at 4th key : " + map1.get(4));
		System.out.println("Data at 100th key : " + map1.get(100));
		
		map1.remove(100);
		System.out.println(map1);
		
		for(Integer key : map1.keySet()) {
			System.out.println("Key is : " + key);
			System.out.println("Value is : " + map1.get(key));
		}
	}

}
