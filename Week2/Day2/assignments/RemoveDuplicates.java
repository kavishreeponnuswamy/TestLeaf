package week2.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";

		String[] splitStringArray = text.split(" ");
		for (int i = 0; i < splitStringArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < splitStringArray.length; j++) {

				if (splitStringArray[i].equals(splitStringArray[j])) {
					count++;
				}
				if (count > 1) {
					splitStringArray[j] = "";
					count = 1;
				}
			}
		}
		String newText = "";
		for (int a = 0; a < splitStringArray.length; a++) {
			System.out.print(newText + splitStringArray[a] + " ");
		}

	}

}
