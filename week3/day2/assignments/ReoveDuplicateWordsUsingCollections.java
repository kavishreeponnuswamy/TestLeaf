package week3.day2.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReoveDuplicateWordsUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "We learn java basics as part of java sessions in java week1";
		String[] splitstr = str.split(" ");

		System.out.println("Line without duplicate words");
		Set<String> uniqueWords = new LinkedHashSet<String>();
		Set<String> dupWords = new HashSet<String>();
		for (String eachword : splitstr) {
			boolean status = uniqueWords.add(eachword);
			if (!status) {
				dupWords.add(eachword);
			} else
				System.out.print(eachword + " ");
		}

		System.out.println("\nDuplicate words are: " + dupWords);
	}

}
