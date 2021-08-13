package week1.day2;

public class LearnReturnVar {

	public int add() { // method returning a result
		int x = 10, y = 20;
		int z = x + y;
		return z;
	}

	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("subtracted value is " + c);
	}
	
	public int mul(int d, int e) {
		int f=d*e;
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnReturnVar obj = new LearnReturnVar();
		int sum = obj.add();
		System.out.println("sum from add method is " + sum);
		obj.sub(60, 30);
		int product = obj.mul(3, 4);
System.out.println("product is "+ product);
	}

}
