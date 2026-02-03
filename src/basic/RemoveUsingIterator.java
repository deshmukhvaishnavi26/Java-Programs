package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveUsingIterator {

	public static void main(String[] args) {
		
		// remove elements using iterator
		
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Selenium", "Automation", "Python"));
		System.out.println("Original List: "+ list);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String value = itr.next();
			
			if(value.equalsIgnoreCase("python") || value.equalsIgnoreCase("automation")) {
				itr.remove();
			}
		}
		
		System.out.println("After removing elements: " + list);
		
	}
	
}
