package basic;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		
		// Compare two Arrays
		
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		//without using equals:
		
		boolean isEqual = true;
		
		if(arr1.length == arr2.length) {
			
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					isEqual = false;
					break;
				}
			}
		}
		
		if(isEqual) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are not Equal");
		}
		
	}
	
}
