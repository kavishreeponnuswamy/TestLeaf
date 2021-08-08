package week1.day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fn = 0;
		int sum = 0;
		int sn = 1;
		System.out.println(fn);
		System.out.println(sn);
		for (int n = 3; n <= 8; n++) {

			sum = fn + sn;
			fn = sn;
			sn = sum;
			System.out.println(sum);

		}
	}

}
