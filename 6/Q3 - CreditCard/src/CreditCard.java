import java.util.Calendar;

public class CreditCard {
	
	private int expiryMonth, expiryYear;
	private String firstName, lastName;
	private String ccNumber;
	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber)	{
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}
	
	public String formatExpiryDate() 	{
		return (expiryMonth + "/" + expiryYear);
	}
	public String formatFullName()	{
		return (firstName + " " + lastName);
	}
	public String formatCCNumber()	{
		String x1 = ccNumber.substring(0, 3);
		String x2 = ccNumber.substring(4, 7);
		String x3 = ccNumber.substring(8, 11);
		String x4 = ccNumber.substring(12, 15);
		String sp = " ";
		return (x1 + sp + x2 + sp + x3 + sp + x4);
	}
	public boolean isValid()	{
		Calendar now = Calendar.getInstance();
		int c_year = now.get(Calendar.YEAR);
		int c_month = now.get(Calendar.MONTH) + 1;
		boolean year = c_year < expiryYear;
		boolean month = c_month < expiryMonth;
		if (year)	{
			return true;
		}
		else {
			return month;
		}
	}
	public String toString()	{
		String number = "Number : " + formatCCNumber() + "\n";
		String exp_date = "Expiration date: " + formatExpiryDate() + "\n";
		String holder = "Account holder: " + formatFullName() + "\n";
		String validity = "Is valid: " + isValid() + "\n";
		
		return (number + exp_date + holder + validity);
	}

}
