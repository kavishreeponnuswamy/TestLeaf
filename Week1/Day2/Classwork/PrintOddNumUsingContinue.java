package week1.day2;

public class PrintOddNumUsingContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) { // loop
			if (i % 2 == 0) { // statement
				continue; // skips the loop when the condition is true
			}
			System.out.println(i);
		}
	}

}
