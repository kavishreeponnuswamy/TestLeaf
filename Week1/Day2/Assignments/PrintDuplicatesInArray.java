package week2.day2.assignments;

public class PrintDuplicatesInArray {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 }; int
	 * length = arr.length; System.out.println("Array length is " + length);
	 * 
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * for (int j = i+1; j < arr.length; j++) { if (arr[i] == arr[j]) {
	 * System.out.println(arr[i] + " is a duplicate number"); } }
	 * 
	 * } }}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 18, 17, 20 };
		int length = arr.length;
		System.out.println("Array length is " + length);

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}
			}
			if (count > 1 && arr[i] != 0) {
				System.out.println(arr[i] + " is a duplicate number");
			}

		}
	}

}
