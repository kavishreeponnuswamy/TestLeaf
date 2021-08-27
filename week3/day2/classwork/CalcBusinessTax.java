package week3.day2;

public class CalcBusinessTax implements TaxCalculation, IncomeCalculation {

	public void calcDeductions(String name, double HRA, double LTA) {
		// TODO Auto-generated method stub
		System.out.println("calcDeductions - Business");
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		// TODO Auto-generated method stub
		System.out.println("calcGrossIncome - Business");
	}

	public int taxSlab() {
		// TODO Auto-generated method stub
		System.out.println("taxSlab - Business");
		return 0;
	}

	public double CalcTaxandPublishValue() {
		System.out.println("CalcTaxandPublishValue - Business");
		// TODO Auto-generated method stub
		return 0;
	}

	public double calcNetIncome(String name, double income1, double income2) {
		System.out.println("calcNetIncome - Business");
		// TODO Auto-generated method stub
		return 0;
	}

}
