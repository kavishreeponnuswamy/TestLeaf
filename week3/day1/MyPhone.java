package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************Call to AndriodPhone***************");
		AndriodPhone andobj = new AndriodPhone();
		andobj.takeVideo();
		andobj.makeCall();
		andobj.saveContact();
		andobj.sendMsg();
		String colour = andobj.colour;
		System.out.println("Colour of phone is " + colour);

		System.out.println("************Call to SmartPhone***************");
		SmartPhone smtobj = new SmartPhone();
		smtobj.connectWhatsApp();
		smtobj.takeVideo();
		smtobj.makeCall();
		smtobj.saveContact();
		smtobj.sendMsg();
		String colour2 = smtobj.colour;
		System.out.println("Colour of phone is " + colour2);
		int size = smtobj.screenSize;
		System.out.println("Size of phone is " + size);
		int pixel = smtobj.cameraPixel;
		System.out.println("Camera Pixel is " + pixel);
	}

}
