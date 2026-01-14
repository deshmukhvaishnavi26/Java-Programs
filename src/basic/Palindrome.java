package basic;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 12321;
		int reverse = 0;
		System.out.println("Original : " + num);
		
		while(num != 0) {
			int last = num % 10;
			reverse = reverse * 10 + last;
			num /= 10;
		}
		
		System.out.println("Reversed : " + reverse);
		
		if(num == reverse) {
			System.out.println("Its a palindrome number");
		}
		else {
			System.out.println("Its not a palindrome number");
		}
		
	}
	
}
