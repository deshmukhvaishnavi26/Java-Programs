package basic;

public class SmallestInArray {

	public static void main(String[] args) {
		
		//find the smallest number in an array
		
		int[] arr = {24,23,76,27,97,18,65,34};
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Smallest number : " + min);
		
	}
	
}
