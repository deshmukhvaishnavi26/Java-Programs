package basic;

public class CountUpperLower {

	public static void main(String[] args) {
		
		// Count Capital and Small Letters in a string
		
		String str = "AutoMation Testing";
		int capital = 0;
		int small = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch>= 'A' && ch<= 'Z') {
				capital++;
			}
			else if(ch>= 'a' && ch <= 'z') {
				small++;
			}
		}
		
		System.out.println("Capital letters : " + capital);
		System.out.println("Small letters : " + small);

	}

}
