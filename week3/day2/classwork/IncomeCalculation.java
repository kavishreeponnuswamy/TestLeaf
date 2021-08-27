package week3.day2;

public interface IncomeCalculation {
	/**
	 * This method calculates the net income
	 * @param name - Employee name
	 * @param income1 - Basic income
	 * @param income2 - Any additional income
	 * @return - returns the net income
	 */
	 public double calcNetIncome(String name, double income1, double income2);
	 /**
	  * This method publishes the calculated tax and publishes the value to user
	  * @return - returns the calculated tax payable
	  */
	 public int taxSlab();
	 
}
