package basic;

public class CountUpperLower {

	public static void main(String[] args) {
		
		// Count Capital and Small Letters in a string
		
		String str = "AutoMation Testing";
		int upper = 0;
		int lower = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch>= 'A' && ch<= 'Z') {
				upper++;
			}
			else if(ch>= 'a' && ch <= 'z') {
				lower++;
			}
		}
		
		System.out.println("Capital letters : " + upper);
		System.out.println("Small letters : " + lower);

	}

}
