package basic;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		
		//Sum of n natural numbers
		
		int num = 10;
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println("Sum of first " + num + " natural numbers is " + sum);

	}

}
