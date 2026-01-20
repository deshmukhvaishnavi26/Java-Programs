package basic;

public class LargestInArray {

	public static void main(String[] args) {
		
		int arr[] = {12,23,34,45,67,78,89,90};
		
		int max = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		
		System.out.println("Largest number in an array is : " + max);
		
	}
	
}
