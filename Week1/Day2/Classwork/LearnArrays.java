package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Arrays are list of value/elements - used to store multiple value is single variable
		//array initialization
		
		//string array
		String[] str = {"Hi", "Hello", "Welcome", "good"};
		//integer array
		int[] c = {1, 2, 3, 4, 5, 6};
		int d[]= {9, 8, 7, 6, 5, 4, 11};
		
		//index:
		//access index
		int value = c[3];
		System.out.println("third value is " + value);
		int x = d[0]+ c[5];
		System.out.println("sum is "+ x);
		
		// To get the No of elements in an array
		int l = str.length;
		System.out.println("Length of the string array is " + l);
		
		//To get all values of an array
		for (int i = 0; i < d.length; i++) {
			System.out.println("d["+i+"]="+d[i]);
			
		// Sorting an array
			Arrays.sort(d);
			for (int j = 0; j < d.length; j++) {
				System.out.println("d["+i+"]="+d[i]);
		}
	}
	
	}	

}
