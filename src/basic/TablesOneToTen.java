package basic;

public class TablesOneToTen {

	public static void main(String[] args) {
		
		// print tables 1 to 10
		
		for(int i=1; i<=10; i++) {
			System.out.println("Table of " + i);
		
			for(int j=1; j<=10; j++) {
				System.out.println(i +"x" +j+ "=" + i*j);
			}
		}
		
	}
	
}
