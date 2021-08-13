package week2.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss";
		int length1 = text1.length();
		int length2 = text2.length();
		if (length1 == length2) {
			char[] a1 = text1.toCharArray();
			char[] a2 = text2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			int count = 0;
			for (int i = 0; i < length1; i++) {
				if (a1[i] == a2[i]) {
					count++;
				}
			}
			if (count == length1) {
				System.out.println("Arrays have same value");
			} else {
				System.out.println("Array values are different");
			}
		}
	}
}

// if (charArray1() == charArray2()) {
/*
 * if (Arrays.equals(a1, a2)) { System.out.println("Arrays have same value"); }
 * else { System.out.println("Array values are different"); } }
 */
