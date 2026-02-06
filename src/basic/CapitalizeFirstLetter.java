package basic;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		
		// capitalize first letter of every word
		
		String input = "Automation testing is important";
		String[] words = input.split(" ");
		
		String result = "";
		
		for(String word : words) {
			result = result + word.substring(0, 1).toUpperCase() +
					word.substring(1) + " ";
		}
		
		System.out.println(result.trim());
	}
	
}
