package week3.day2;

public interface TaxCalculation {

 String compaNyname = "Taxer";
 /**
  * This method calculates the deductions in tax
  * @param name - Employee name
  * @param HRA - House rent allowance
  * @param LTA - Leave and travel allowance
  */
	void calcDeductions(String name, double HRA, double LTA);
/**
 * This method calculates the gross income
 * @param name - employee name
 * @param netIncome - The net income
 * @param deductions - the tax deductions submitted
 */
	void calcGrossIncome(String name, double netIncome, double deductions);
/**
 * This method calculates the tax slab based on gross income
 * @return - returns the tax slab percentage
 */
	public int taxSlab();
/**
 * This method publishes the calculated tax and publishes the value to user
 * @return - returns the calculated tax payable
 */
	public double CalcTaxandPublishValue();

}
