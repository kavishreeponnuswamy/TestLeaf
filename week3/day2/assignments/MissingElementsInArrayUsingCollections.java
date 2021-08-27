package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsInArrayUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 7, 6, 8 }; // 5 is missing and is not sorted

		List<Integer> intList = new ArrayList<Integer>();

		for (Integer eachelement1 : a) {
			intList.add(eachelement1);
		}
		Collections.sort(intList);
		System.out.println("Sorted list is: " + intList);
		int size = intList.size();
		System.out.println("Size of the list is: " + size);
		int j = 1;
		for (Integer eachelement2 : intList) {
			if (j != eachelement2) {
				System.out.println("the missing element is " + j);
				break;
			}
			j++;

		}

	}
}
