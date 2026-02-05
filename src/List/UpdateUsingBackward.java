package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class UpdateUsingBackward {

	public static void main(String[] args) {
		
		// update using backward traversal 
		
		List<String> list = new ArrayList<>(Arrays.asList("Selenium", "Java", "Automation"));
		
		ListIterator<String> itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			String value = itr.previous();
			
			if(value.equals("Java")) {
				itr.add("Python");
			}
			if(value.equalsIgnoreCase("selenium")) {
				itr.set("SELENIUM");
			}
			
		}
		
		System.out.println("After Update : " + list);
		
	}
	
}
