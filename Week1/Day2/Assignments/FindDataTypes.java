package week2.day2.assignments;

public class FindDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				char[] charArray = test.toCharArray();
				int length = charArray.length;
				for (int i = 0; i < length; i++) {
					if (Character.isLetter(charArray[i])) {
						letter++;
					} else if (Character.isSpaceChar(charArray[i])) {
						space++;
					}else if (Character.isDigit(charArray[i])) {
						num++;
					}else {
						specialChar++;
					}
				}
				System.out.println("Number of letters is " +letter );
				System.out.println("Number of space is " +space );
				System.out.println("Number of numbers is " +num );
				System.out.println("Number of special characters is " +specialChar );
	}

}
