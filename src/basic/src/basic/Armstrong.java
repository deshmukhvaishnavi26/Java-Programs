package basic;

public class Armstrong {

	//A number whose sum of digits raised to the power of number of digits equals the number itself
	
	public static void main(String[] args) {
		
		int num = 370;
		int original = num;
		int sum = 0;
		
		while(num != 0) {
			int last = num % 10;
			sum = sum + (last * last * last);
			num /= 10;
		}
		
		System.out.println("Original : " + original);
		System.out.println("Sum : " + sum);
		
		if(original == sum) {
			System.out.println("It's an Armstrong number");
		}
		else {
			System.out.println("It's not an Armstrong number");
		}
		
		
		
	}
	
}
