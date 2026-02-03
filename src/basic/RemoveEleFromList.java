package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEleFromList {

	public static void main(String[] args) {
		
		// remove multiple elements from a list
		
		List<String> list = new ArrayList<>(Arrays.asList("Python", "Java", "Selenium", "Testing"));
		
		System.out.println("Original List : " + list);
		
		for(int i=0; i<list.size(); i++) {
			list.set(i, list.get(i).toLowerCase());
		}
		
		List<String> list2 = new ArrayList<>();
		list2.add("python");
		list2.add("testing");
		
		list.removeAll(list2);
		
		System.out.println("After removing elements : " + list);
		
	}
	
}
