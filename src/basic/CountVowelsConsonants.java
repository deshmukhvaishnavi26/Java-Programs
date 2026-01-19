package basic;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		
		// count vowels and consonants in a string
		
		String name = "Deshmukh";
		name = name.toLowerCase();
		System.out.println(name);
		
		int vowels = 0;
		int consonants = 0;
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i') {
				vowels++;
			}
			else if(ch>='a' && ch<='z') {
				consonants++;
			}
		}
		
		System.out.println("Count of Vowels : " + vowels);
		System.out.println("Count of Consonants : " + consonants);
		
	}
	
}
