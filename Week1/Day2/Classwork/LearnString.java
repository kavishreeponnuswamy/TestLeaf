package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize a string has 2 ways
		// one: -- literals
		String str = "Welcome To TestLeaf"; // Object is created for class String with name str
		
		//To find String length
		int lengthstr = str.length();
		System.out.println("String length is " + lengthstr);
		
		// Find a character in a string : 4th position
		char charAt4 = str.charAt(4);
		System.out.println("Character at 4 is " + charAt4);
		
		// Find a position using the character L
		int indexOfL = str.indexOf('L');
		System.out.println("Position of L is "+ indexOfL);
		
		// Find a position using the character T
				int indexOfT = str.indexOf('T');
				System.out.println("Position of T is "+ indexOfT);
				
				// last occurance of T
				int indexOfTchar = str.indexOf('T');
				System.out.println("Position of last T is "+ indexOfTchar);
		
				//converting string into array
				char[] charArray = str.toCharArray();
				for (int i = 0; i < charArray.length; i++) {
					System.out.println("charArray["+i+"]="+charArray[i]);	
				}
		//splitting a string
				String[] splitstr = str.split(" ");
				System.out.println(splitstr);
		
		//two: -- new keyword
	
		
		
	}

}
