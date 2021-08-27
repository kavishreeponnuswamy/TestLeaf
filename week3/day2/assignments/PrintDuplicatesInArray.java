package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 18, 17, 20 };
		Set<Integer> intSet = new HashSet<Integer>();
		Set<Integer> dupIntSet = new HashSet<Integer>();
		for (Integer eachNumber : arr) {
			boolean status = intSet.add(eachNumber);
			if (!status) {
				dupIntSet.add(eachNumber);
			}
		}

		System.out.println("Unique numbers are: " + intSet);
		System.out.println("Duplicate numbers are: " + dupIntSet);
	}

}
