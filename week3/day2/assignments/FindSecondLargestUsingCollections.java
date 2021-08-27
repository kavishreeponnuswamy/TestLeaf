package week3.day2.assignments;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class FindSecondLargestUsingCollections {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };

		List<Integer> intset = new ArrayList<Integer>();

		for (Integer eachelement1 : data) {
			intset.add(eachelement1);
		}
		Collections.sort(intset);
		System.out.println("Sorted list is: " + intset);
		int size = intset.size();
		System.out.println("Size of the list is: " + size);

		System.out.println("The second largest number is " + intset.get(size - 2));
	}

}
