package basic;

public class CountDigits {

	public static void main(String[] args) {
		
		//Count digits in a number
		
		int num = 1234567;
		int count = 0;
		
		while(num!=0) {
			count++;
			num /= 10;
		}
		
		System.out.println("Count of Digits in a number is " + count);
		
	}
	
}
