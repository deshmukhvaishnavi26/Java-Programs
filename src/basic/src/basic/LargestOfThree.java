package basic;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int num1=12;
		int num2=23;
		int num3=34;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater");
		}
		else if( num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is greater");
		}
		else if(num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is greater");
		}
		else {
			System.out.println("two or more numbers are equal");
		}
		
		//using math.max
		int largest = Math.max(num1, Math.max(num2, num3));
		System.out.println("Largest number is " + largest);
		
	}
	
}
