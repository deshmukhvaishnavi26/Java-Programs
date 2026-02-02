package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAList {

	public static void main(String[] args) {
		
		//reverse a list
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
	}
	
}
