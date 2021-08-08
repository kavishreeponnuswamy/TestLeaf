package week1.day1.assignment;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int original = 153;
		int j = original;
		int calculated = 0;
		
		while (original != 0) {
			int reminder = original % 10;
			int y = reminder * reminder * reminder;
			System.out.println("y is " + y);
			calculated = calculated + y;
			System.out.println("Calculated is " + calculated);
			int quotient = original / 10;
			original = quotient;
			System.out.println("Original is " + original);
		}
		if (calculated == j) {
			System.out.println(calculated + " is an Amstrong number");
		} else {
			System.out.println(calculated + " is not a Amstrong number");
		}

	}
}
