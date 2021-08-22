package week3.day1;

public class SmartPhone extends AndriodPhone {

	public void connectWhatsApp() {
		System.out.println("Connect to Whatsapp");

	}

	//Mthod Overriding of takevideo() method in AndroidPhone class
	public void takeVideo() {
		System.out.println("take video from Smartphone class");
	}

	int cameraPixel = 10;
}
