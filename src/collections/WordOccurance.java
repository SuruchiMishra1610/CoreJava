package collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World Live World";
		String[] words = str.split(" ");
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		for(String word : words) {
			
			if(map1.get(word) == null) {
				map1.put(word, 1);
			} else {
				
				map1.put(word, map1.get(word)+1);
			}
		}
		
		System.out.println(map1);
	}

}
