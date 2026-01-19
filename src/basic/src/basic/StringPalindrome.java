package basic;

public class StringPalindrome {

	public static void main(String[] args) {
		
		//check if a string is palindrome
		
		String name = "level";
		String reversed = "";
		
		for(int i= name.length()-1; i>=0; i--) {
			reversed += name.charAt(i);
		}
		
		System.out.println("Original : " + name);
		System.out.println("Reversed : " + reversed);
		
		if(name.equals(reversed)) {
			System.out.println("It is Palindrome String");
		}
		else {
			System.out.println("It is not palindrome String");
		}
		
	}
	
}
