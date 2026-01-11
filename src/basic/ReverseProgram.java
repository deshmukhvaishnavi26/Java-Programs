package basic;

public class ReverseProgram {

	public static void main(String[] args) {
		
		int num = 1234;
		int reverse = 0;
		
		while(num != 0) {
			int num2 = num % 10; // gives last digit
			reverse = reverse*10 + num2; //add to reverse
			num /= 10;   // remove last digit			
			
		}
		
		System.out.println("Reversed num: " + reverse);
		
	}
	
}
