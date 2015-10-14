
public class ProjectDate {
	
	private int weekNo, dayNo;
	
	public boolean checkDay(int day)	{
		return day >= 1 && day <= 5;
	}
	
	public ProjectDate()	{
		weekNo = 0;
		dayNo = 1;
	}
	
	public int getWeekNo()	{
		return weekNo;
	}
	public void setWeekNo(int n)	{
		weekNo = n;
	}
	public int getDayNo()	{
		return dayNo;
	}
	public void setDayNo(int n){
		if (checkDay(n))	{
			dayNo = n;
		}
	}
	public void advance(int n)	{
		if (checkDay(n))	{
			if (checkDay(dayNo + n))	{
				dayNo = dayNo + n;
			}
		}
	}
	public String toString()	{
		return ("Week: " + weekNo + " Day: " + dayNo);
	}

}
