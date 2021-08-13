package week1.day2;

public class MyMobile {
// variables/Instance variables (global)
	int screenSize = 5;
	int cost;
	char logo;
	float amps = 2.456f;
	long mobileNumber;
	boolean isTouchScreen;
	String brandName;

	// methods
	// methods syntax/method signature
	// access modifier_return type_method name(args){ method body}
	// access modifiers
	// public : accessed by all classes in a project
	// private : Only that class can use it. No other classes can make use of it
	// protected : Same as package, but when inherited can be used by parent class
	// package/default : accessed in package level
	public void makeCalls() {
		String callMsg = "Hello"; // local variables, scope is within the method
		System.out.println("Making Calls");
		System.out.println(callMsg);
	}

	public void takePics() {
		System.out.println("Take pictures");
		// System.out.println(callMsg); not possible as callMsg is a local variable and is confined to makeCalls() method
	}

	private void makePayments() {
		System.out.println("Making Payments");
	}

	public static void main(String[] args) {
		// access the class variables and methods
		// object creation/Instantiate (creating an instance of a class)
		// syntax
		// Classname objectname = new contructor
		MyMobile mobobj = new MyMobile();
		mobobj.makeCalls();
		mobobj.makePayments();
		mobobj.takePics();

		// shortcut - ctrl+1 -assign to local variable
		int screenSize2 = mobobj.screenSize;
		System.out.println("screensize is : " + screenSize2);
	}

}
