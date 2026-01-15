package basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//Fibonacci series means where each number is a sum of the previous 2 numbers, starting from 0 and 1.
		
		int first = 0;
		int second = 1;
		
		System.out.print(first + " " + second + " ");
		
		for(int i=2; i<=10; i++) {
			int next = first + second;
			System.out.print(next + " ");
			
			first = second;
			second = next;
		}
		
	}
	
}
