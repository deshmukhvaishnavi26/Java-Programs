package basic;

public class CountWords {

	public static void main(String[] args) {
		
		// Count the number of words in a string
		
		String sentence = "I am Learning Automation Testing";
		
		sentence = sentence.trim();
		
		String[] words = sentence.split(" ");
		
		System.out.println("Number of words : " + words.length);
		
		for(String word : words) {
			System.out.println(word);
		}
		
	}
	
}
