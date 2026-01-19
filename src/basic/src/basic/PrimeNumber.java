package basic;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// prime numbers from 1 to 100
		
		for(int num=2; num<=100; num++) {
			int count = 0;
			
			for(int j=1; j<=num; j++) {
				if(num%j == 0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println(num);
			}
		}
		
	}
	
}
