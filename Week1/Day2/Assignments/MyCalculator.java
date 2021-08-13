package week2.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		int addition = calc.addition();
		System.out.println("Sum of nos is " + addition);
		
		int diff1 = calc.subtraction();
		System.out.println("Sum of nos is " + diff1);
		
		double product = calc.product();
		System.out.println("Sum of nos is " + product);
		
		float division = calc.division();
		System.out.println("Sum of nos is " + division);
	}

}
