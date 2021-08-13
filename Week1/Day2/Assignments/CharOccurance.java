package week2.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					count++;
					charArray[j] = 0;
				}

			}
			if (charArray[i] != 0 && charArray[i] != ' ') {
				System.out.println(charArray[i] + " is present " + count + " times ");
			}

		}
	}

}
