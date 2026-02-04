package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class AddUsingListIterator {

	public static void main(String[] args) {
		
		//Add element using add
		
		List<String> list = new ArrayList<>(Arrays.asList("Automation", "Java", "Python"));
		System.out.println("Original List: " + list);
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			String value = itr.next();
			
			if(value.equals("Automation")) {
				itr.add("Testing");
			}
		}
		
		System.out.println("After adding : " + list);
		
	}
	
}
