package week2.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)
		String test = "I am a software tester";
		String[] str = test.split(" ");
		int length = str.length;

		for (int i = 0; i < length; i++) {
			if (i % 2 != 0) {
				StringBuilder str2 = new StringBuilder(str[i]);
				str[i] = str2.reverse().toString();
				System.out.print(str[i] + " ");
			} else {
				System.out.print(str[i] + " ");
			}
		}

	}

}
