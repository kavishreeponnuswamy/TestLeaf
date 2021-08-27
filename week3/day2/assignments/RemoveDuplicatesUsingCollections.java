package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "PayPal";
		char[] charArray = str.toCharArray();

		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupCharSet = new HashSet<Character>();
		for (Character eachcharacter : charArray) {
			boolean status = charSet.add(eachcharacter);
			if (!status) {
				dupCharSet.add(eachcharacter);
			}
		}

		System.out.println("Unique characters are: " + charSet);
		System.out.println("Duplicate characters are: " + dupCharSet);
	}

}
