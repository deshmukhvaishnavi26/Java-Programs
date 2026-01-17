package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		// Swapping Two numbers with 3rd variable
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Before swap num1 : "+ num1 + " and num2 : "+ num2);
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("After swap num1 : "+ num1 + " and num2 : "+ num2);
		
		// Swapping two numbers without 3rd variable
		
		int a = 30;
		int b = 40;
		
		System.out.println("Before Swap a : " + a + " and b : " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap a : " + a + " and b : " + b);
	}
	
}
