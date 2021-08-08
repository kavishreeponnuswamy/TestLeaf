package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inpnum = 13;
		boolean flag1 = false;
		int rem = 0;
		for (int i = 2; i <= inpnum / 2; i++) {
			rem = inpnum % 2;
			if (rem == 0) {
				flag1 = true;
				break;
			}
		}
		if (flag1) {
			System.out.println(inpnum + " number is not prime");
		} else {
			System.out.println(inpnum + " number is prime");
		}
	}

}
