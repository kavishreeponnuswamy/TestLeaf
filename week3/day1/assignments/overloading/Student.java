package week3.day1.assignments.overloading;

public class Student {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("Studnt id is " + id);
	}

	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("Studnt id is " + id);
		System.out.println("Studnt name is " + name);
	}

	public void getStudentInfo(String email, long phoneno) {
		// TODO Auto-generated method stub
		System.out.println("Studnt email is " + email);
		System.out.println("Studnt phone no is " + phoneno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studobj = new Student();
		studobj.getStudentInfo(102);
		studobj.getStudentInfo(102, "Kavi");
		studobj.getStudentInfo("kavi*gmail.com", 898942775);

	}

}
