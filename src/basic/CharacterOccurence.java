package basic;

public class CharacterOccurence {

	public static void main(String[] args) {
		// Find Occurrences of a character in a string
		
		String str = "automation testing";
		char ch = 't';
		int count = 0;
		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == 't') {
				count++;
			}
		}
		
		System.out.println("Character " + ch + " occurred " + count + " times ");

		
		
	}

}
