package week3.day1;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		obj.add(2, 3);
		obj.add(2, 3, 4);
		obj.subtract(4.567, 2.345);
		obj.subtract(5, 3);
		obj.divide(6.789, 2);
		obj.divide(8, 4);
		obj.multiply(2, 4.895);
		obj.multiply(3, 7);
	}
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Sum of add method 1 is " + c);
	}
	public void add(int x, int y, int z) {
		int p= x+y+z;
		System.out.println("Sum of add method 2 is " + p);
	}
	public void multiply(int a, int b) {
		int c = a*b;
		System.out.println("Sum of multiply method 1 is " + c);
	}
	public void multiply(int x, double y) {
		double p= x*y;
		System.out.println("Sum of multiply method 2 is " + p);
	}
	public void divide(int a, int b) {
		int c = a/b;
		System.out.println("Sum of divide method 1 is " + c);
	}
	public void divide(double x, int y) {
		double z = x*y;
		System.out.println("Sum of divide method 2 is " + z);
	}
	public void subtract(int a, int b) {
		int c = a-b;
		System.out.println("Sum of subtract method 1 is " + c);
	}
	public void subtract(double x, double y) {
		double z = x*y;
		System.out.println("Sum of subtract method 2 is " + z);
	}
}
