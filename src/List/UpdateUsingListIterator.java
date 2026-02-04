package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class UpdateUsingListIterator {

	public static void main(String[] args) {
		
		//update a list using list iterator
		
		List<String> list = new ArrayList<>(Arrays.asList("Selenium", "Java", "Automation", "Testing"));
		
		System.out.println("Before changes: " + list);
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			String value = itr.next();
			
			if (value.equals("Java")) {
                itr.set("JAVA");
            }
		}
		
		System.out.println("After changes: " + list);
		
	}
	
}
