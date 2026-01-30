package basic;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		
		//Sort an Array with sort
		
		int[] arr1 = {6,2,8,5,1,4};
		
		Arrays.sort(arr1);
		
		System.out.println("Sorted array using Sort()");
		for(int num : arr1) {
			System.out.println(num);
		}
		
		//sort an Array without sort
		
		int[] arr2 = {6,2,8,5,1,4};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=i+1; j<arr2.length; j++) {
				
				if(arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
				
			}
		}
		
		System.out.println("Sorted array without using sort()");
		for(int num : arr2) {
			System.out.println(num);
		}
		
	}
	
}
