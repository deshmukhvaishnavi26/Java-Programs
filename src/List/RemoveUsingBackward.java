package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RemoveUsingBackward {

	public static void main(String[] args) {
		
		//Remove elements using list iterator
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println("Original removing : " + list);
		
		ListIterator<Integer> itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			Integer value = itr.previous();
			
			if(value.equals(4) || value.equals(7)) {
				itr.remove();
			}	
		}
		
		System.out.println("After removing : " + list);
		
	}

}
