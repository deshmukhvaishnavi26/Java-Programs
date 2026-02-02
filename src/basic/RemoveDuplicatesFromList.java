package basic;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		
		//Remove duplicates from List
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(6);
		
		List<Integer> uniqueList = new ArrayList<>();
		
		for(int num : list) {
			if(!uniqueList.contains(num)) {
				uniqueList.add(num);
			}
		}
		
		System.out.println("Unique List: ");
		for(int num : uniqueList) {
			System.out.println(num);
		}
	}
	
}
