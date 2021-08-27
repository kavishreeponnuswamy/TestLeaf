package week3.day2;

import week3.day1.assignments.overriding.BankInfo;

public class CalcIndividualsTax extends BankInfo implements TaxCalculation, IncomeCalculation{
	
	String name = compaNyname;

	public void calcDeductions(String name, double HRA, double LTA) {
		// TODO Auto-generated method stub
		System.out.println("calcDeductions - individual");
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		// TODO Auto-generated method stub
		System.out.println("calcGrossIncome - individual");
	}

	public int taxSlab() {
		// TODO Auto-generated method stub
		System.out.println("taxSlab - individual");
		return 0;
	}

	public double CalcTaxandPublishValue() {
		System.out.println("CalcTaxandPublishValue - individual");
		// TODO Auto-generated method stub
		return 0;
	}

	public double calcNetIncome(String name, double income1, double income2) {
		System.out.println("calcNetIncome - individual");
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void ownMethod() {
		System.out.println("ownMethod - individual");
		
	}

}
