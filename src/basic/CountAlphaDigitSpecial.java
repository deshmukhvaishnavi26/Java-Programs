package basic;

public class CountAlphaDigitSpecial {

	public static void main(String[] args) {
		
		// Count Alphabets Digits and Special Characters in a string
		
		String str = "Programming@1234";
		int alphabets = 0;
		int digits = 0;
		int special = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch>= 'a' && ch<= 'z' || ch>= 'A' && ch<= 'Z') {
				alphabets++;
			}
			else if(ch>= '0' && ch<= '9') {
				digits++;
			}
			else {
				special++;
			}
			
		}
		
		System.out.println("Count of Alphabets : " + alphabets);
		System.out.println("Count of Digits : " + digits);
		System.out.println("Count of Special Character : " + special);
		
	}
	
}
