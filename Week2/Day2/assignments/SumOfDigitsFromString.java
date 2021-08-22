package week2.day2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Tes12Le79af65";
		int sum =0;
		String newText = text.replaceAll("\\D", "");
		System.out.println(newText);
		char[] charArray = newText.toCharArray();
		int j = charArray.length;
		System.out.println(j);
		for (int i=0; i< j; i++) {
			//boolean digit = Character.isDigit(charArray[i]);
			int num = Character.getNumericValue(charArray[i]);
			sum = sum+num;	
		}
		System.out.println("Sum of digits is " + sum);
	}

}
