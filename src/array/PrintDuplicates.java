package array;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		// find duplicates in an array
		
		int[] arr = {1,2,2,3,4,5,5,6,7,7};
		
		Set<Integer> set = new HashSet<>();
		
		System.out.println("Original Array: ");
		for(int num: arr) {
			System.out.println(num);
		}
		
		System.out.println("Dupliacte Elements: ");
		for(int num : arr) {
			if(!set.add(num)) {
				System.out.println(num);
			}
		}
	}
	
}
