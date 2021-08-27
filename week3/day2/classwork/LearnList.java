package week3.day2;

import java.util.ArrayList;

import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 2, 2, 1 };
		int arr1[] = { 6, 2, 1, 8 };

		List<Integer> intlist1 = new ArrayList<Integer>();

//Other method to convert arrays to List by sending the array as a argument in constructor
// List<Integer> intlist1 = new ArrayList <Integer>(Arrays.asList(arr));

		for (int i = 0; i < arr.length; i++) {

			intlist1.add(arr[i]);

		}
		System.out.println(intlist1);

		List<Integer> intlist2 = new ArrayList<Integer>();

		for (int j = 0; j < arr1.length; j++) {
			intlist2.add(arr1[j]);
		}

		System.out.println(intlist2);

//Print unique elements in first array arr[]
//System.out.println(intlist1.removeAll(intlist2));
//System.out.println(intlist1);

//Print the duplicates from second array arr1[]
		System.out.println(intlist1.retainAll(intlist2));
		System.out.println(intlist1);
	}

}
