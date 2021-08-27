package week3.day2.assignments;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {

		String str[] = { "Aspire systems", "Cts", "wipro", "Hcl" };
		List<String> stringList = new ArrayList<String>();

		for (String eachString : str) {

			stringList.add(eachString);
		}
		Collections.sort(stringList);
		System.out.println("Sorted String array: " + stringList);
		Collections.reverse(stringList);
		System.out.println("Reversed String array: " + stringList);
		System.out.println(stringList);
	}

}
