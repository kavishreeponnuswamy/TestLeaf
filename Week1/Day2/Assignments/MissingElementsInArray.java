package week2.day2.assignments;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 7, 6, 8 }; // 5 is missing and is not sorted

//sort the array
		Arrays.sort(a); // {1, 2, 3, 4, 6, 7, 8}

		System.out.println(a.length); // Array length = 7

		for (int i = 0; i < a.length; i++) {
			int j = i + 1;
			if (j != a[i]) {
				System.out.println("the missing element is " + j);
				break;
			}

		}
	}

}
