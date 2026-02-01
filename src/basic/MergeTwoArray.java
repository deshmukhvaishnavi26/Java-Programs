package basic;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		//merge two array
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		int[] merged = new int[arr1.length + arr2.length];
		
		int index = 0;
		
		for(int i=0; i<arr1.length; i++) {
			merged[index] = arr1[i];
			index++;
		}
		
		for (int i=0; i<arr2.length; i++) {
			merged[index] = arr2[i];
			index++;
		}
		
		
		System.out.println("Merged array: ");
		for(int num : merged) {
			System.out.println(num);
		}
	}
	
}
