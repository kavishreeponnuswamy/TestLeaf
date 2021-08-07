package week1.day1;

public class LearnWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Looping statement Same task is performed multiple no of times When we do not
		 * know the no of iterations - this makes if diff from for statement
		 */
		int i = 345;
		int sum = 0;
		while (i != 0) {
			int reminder = i % 10;
			sum = sum + reminder;
			int j = i / 10;
			i = j;

		}
		System.out.println("Sum of the digits is " + sum);
	}

}
