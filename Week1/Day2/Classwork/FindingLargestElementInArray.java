package week1.day2;

import java.util.Arrays;

public class FindingLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize an array
int arrNum[]= {34, 203, 5, 78, 100, 1000, 1};
//sort the array
Arrays.sort(arrNum);


//Print the last element of the array
System.out.println("Last element is" + arrNum[arrNum.length-1]);

//Print the second largest element of the array
	System.out.println("Seconf largest element is" + arrNum[arrNum.length-2]);	
	
	//Collections.reverse(arrNum);
	//Print the second smallest element of the array
		System.out.println("Seconf smallest element is" + arrNum[1]);	
	
	}

		
}
