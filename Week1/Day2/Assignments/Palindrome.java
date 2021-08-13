package week2.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "madam";
		System.out.println("Original string is "+ original);
		String reverse = "";
		int length = original.length();

		for (int j = length - 1; j >= 0; j--) {
			reverse = reverse + original.charAt(j);
		}

		System.out.println("Reversed string is " + reverse);

		if (original.equals(reverse)) {
			System.out.println(original + " is a palindrome");
		} else {
			System.out.println(original + " is not a palindrome");
		}

	}

}
