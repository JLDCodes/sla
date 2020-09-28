/**
 * Program Name: JLD_LoanPayable.java(file_name)
 * Purpose: an interface which holds the conversion rate and an abstract method to calculate the loan payment
 * Coder: JL
 * Date:April 2nd, 2020
 */
public interface JLD_LoanPayable {
	//conversion rate
	double ANNUAL_RATE_TO_MONTHLY_RATE = (double)1/1200;
	
	//abstract method that will be implemented in the StudentLoanApp 
	abstract double calculateLoanPayment(double osl, double primeIntRate, int months);
}
