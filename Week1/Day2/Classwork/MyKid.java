package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile object1 = new MyMobile();
		object1.takePics();
		object1.makeCalls();
//object1.makePayments(); this is a private method of LearnClassMyMobile and so its not accessible
		float amps = object1.amps;
		System.out.println("Amp value is " + amps);
	}

}
