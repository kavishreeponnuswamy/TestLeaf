package week3.day1.assignments.org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("This is the desktop size method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop deskobj = new Desktop();
		Computer compobj = new Computer();
		
		deskobj.computerModel();
		deskobj.desktopSize();
		
		System.out.println("**********Call to Computer class****************");
		compobj.computerModel();
	}

}
