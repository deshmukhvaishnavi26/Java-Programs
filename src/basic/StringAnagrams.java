package basic;

import java.util.Arrays;

public class StringAnagrams {

	public static void main(String[] args) {
		
		//check whether 2 string are anagrams
		
		String str1 = "evil";
		String str2 = "vile";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Strings are Anagram");
		}
		else {
			System.out.println("Strings are not Anagram");
		}
		
	}
	
}
