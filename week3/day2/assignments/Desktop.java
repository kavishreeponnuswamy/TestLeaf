package week3.day2.assignments;

public class Desktop implements Software, Hardware{

	public static void main(String[] args) {
		
		Desktop compObj = new Desktop();
		
		compObj.desktopModel();
		compObj.hardwareResources();
		compObj.softwareResources();
		compObj.computerBrand();
	}

	public void hardwareResources() {
		System.out.println("Hardware resources of the computer");
	}

	public void softwareResources() {
		System.out.println("Software resources of the computer");
		
	}
	
	public void desktopModel() {
		System.out.println("Computer Model");
	}

	public void computerBrand() {
		System.out.println("Computer Brand");
		
	}



}
