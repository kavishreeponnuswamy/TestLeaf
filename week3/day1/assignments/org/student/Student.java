package week3.day1.assignments.org.student;

import week3.day1.assignments.org.college.College;
import week3.day1.assignments.org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Kavi");
	}

	public void studentDept() {
		System.out.println("Student Dept is ECE");
	}

	public void studentId() {
		System.out.println("Student ID  is 10262");
	}

	public static void main(String[] args) {
		College collobj = new College();
		Department deptobj = new Department();
		Student studobj = new Student();
		System.out.println("************ Call to College class***************");
		collobj.collegeCode();
		collobj.collegeName();
		collobj.collegeRank();
		System.out.println("************ Call to Department class***************");
		deptobj.collegeCode();
		deptobj.collegeName();
		deptobj.collegeRank();
		deptobj.deptName();
		System.out.println("************ Call to Student class***************");
		studobj.collegeCode();
		studobj.collegeName();
		studobj.collegeRank();
		studobj.deptName();
		studobj.studentName();
		studobj.studentId();
		studobj.studentDept();
	}

}
