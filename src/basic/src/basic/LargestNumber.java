package basic;

public class LargestNumber {

	public static void main(String[] args) {
		
		int num1 = 37;
		int num2 = 78;
		
		//using ternary operator
		int largest = (num1 > num2)? num1 : num2;
		System.out.println("Largest number is " + largest);
		
		//using if else
		if(num1 > num2) {
			System.out.println("Largest number is " + num1);
		}
		else if(num2 > num1) {
			System.out.println("Largest number is " + num2);
		}
		else {
			System.out.println("Both are equal");
		}
		
	}
	
}
