package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;


public class FindIntersectionUsingColections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 3, 2, 11, 4, 6, 7 };
		int a2[] = { 1, 2, 8, 4, 9, 7 };

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (Integer eachelement1 : a1) {
			list1.add(eachelement1);
		}
		for (Integer eachelement2 : a2) {
			list2.add(eachelement2);
		}
		
		list1.retainAll(list2);
		System.out.println("The common numbers are: " + list1);
	}
}
		
