package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAList {

	public static void main(String[] args) {
		
		//sort a list
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(9);
		list.add(2);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
	
}
