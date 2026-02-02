package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestSmallestInList {

	public static void main(String[] args) {
		
		//Find Largest and Smallest number in a list
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		int max = list.get(0);
		int min = list.get(0);
		
		for(int num : list) {
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		
		System.out.println("Largest number : " + max);
		System.out.println("Minimum number : " + min);
		
	}
	
}
