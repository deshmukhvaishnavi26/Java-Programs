package basic;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		//remove duplicate element from an array
		
		int[] arr = {1,2,3,4,4,4,5,6};
		
		HashSet<Integer> set = new HashSet<>();
		
		for (int num : arr) {
			set.add(num);
		}
		
		System.out.println("Array after removing duplicates: ");
		
		for(int num : set) {
			System.out.println(num);
		}
		
		//without using set
		
		int[] arr3 = {1,2,2,3,3,4,5,6,7};
		int[] arr4 = new int[arr3.length];
		
		int index = 0;
		
		for(int i=0; i<arr3.length; i++) {
			boolean isDuplicate = false;
			
			for(int j=0; j<index; j++) {
				if(arr3[i] == arr4[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				arr4[index]= arr3[i];
				index++;
			}
		}
		
		System.out.println("Without using set : ");
		for(int i=0; i< index; i++) {
			System.out.println(arr4[i]);
		}
		
		
	}
	
}
