
public class Cost {
	
	private int amount;
	private String currency;
	
	public boolean checkAmount()	{
		return amount >= 0;
	}
	public boolean checkCurrency()	{
		if (currency.equals("pounds sterling"))	{
			return true;
		}
		else if (currency.equals("US dollars"))	{
			return true;
		}
		else if (currency.equals("euros"))		{
			return true;
		}
		else	{
			return false;
		}
	}
	
	public Cost ()	{
		amount = 0;
		currency = "pounds sterling";
	}
	
	public int getAmount()	{
		return amount;
	}
	public String getCurrency()	{
		return currency;
	}
	public void setAmount(int n)	{
		if (checkAmount())	{
			amount = n;
		}
	}
	public void setCurrency(String s)	{
		if (checkCurrency())	{
			currency = s;
		}
	}
	public void convert(String newCurrency, double rate)	{
		if (checkCurrency())	{
			currency = newCurrency;
			amount = (int) (amount / rate);
		}
	}
	public String toString()	{
		return (amount + " " + currency);
	}
	public String secret()	{
		return "S1445060";
	}

}
