package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class BackwardTraversal {

	public static void main(String[] args) {
		
		// backward traversal 
		
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Selenium", "TestNG"));
		System.out.println("Original list : " +list);
		ListIterator<String> itr = list.listIterator(list.size());
		
		while (itr.hasPrevious()) {
            String value = itr.previous();
            System.out.println(value);
        }
		
	
	}
	
}
