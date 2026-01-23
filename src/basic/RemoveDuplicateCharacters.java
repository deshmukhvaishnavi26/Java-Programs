package basic;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		// Remove Duplicate Characters from a String
		
		String str = "programming";
		String result = "";
		
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(result.indexOf(ch) == -1) {
				result = result + ch;
			}
			
		}
		
		System.out.println("Original String : " + str);
		System.out.println("Without Duplicates : " + result);
		
	}
	
}
