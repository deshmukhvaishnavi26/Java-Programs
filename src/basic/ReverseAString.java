package basic;

public class ReverseAString {

	public static void main(String[] args) {
		
		//Reverse a string
		
		String name = "vaishnavi";
		String reversed = "";
		
		for(int i=name.length()-1; i>=0; i-- ) {
			reversed += name.charAt(i);
		}
		
		System.out.println("original : " + name);
		System.out.println("Reversed : " + reversed);
		
	}
	
}
