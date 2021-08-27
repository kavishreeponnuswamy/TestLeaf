package week3.day2;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcIndividualsTax indobj = new CalcIndividualsTax();
		CalcBusinessTax busobj = new CalcBusinessTax();
		
		indobj.calcDeductions("Kavi", 235.4534, 2.4645);
		indobj.calcGrossIncome("Kavi", 1635452.343, 75874.3463);
		indobj.calcNetIncome("Kavi", 235.342, 657.3463);
		indobj.CalcTaxandPublishValue();
		indobj.deposit();
		indobj.ownMethod();
		indobj.taxSlab();
		System.out.println(indobj.name);
		
		busobj.calcDeductions("Shree", 0, 0);
		busobj.taxSlab();
		busobj.CalcTaxandPublishValue();
		busobj.calcGrossIncome("Shree", 0, 0);
		busobj.calcNetIncome("Shree", 0, 0);
		
	}

}
