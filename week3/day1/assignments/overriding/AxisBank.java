package week3.day1.assignments.overriding;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("It is a recurring deposit in Axis bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankInfo bankobj = new BankInfo();
		AxisBank axisobj = new AxisBank();
		
		System.out.println("*****Call to bank methods******************");
		
		bankobj.deposit();
		bankobj.fixed();
		bankobj.saving();
		
		System.out.println("*****Call to Axis bank methods******************");
		
		axisobj.deposit();
	}

}
