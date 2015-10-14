import java.util.ArrayList;


public class Video {
	
	private String title;
	private boolean checked = false;
	private ArrayList ratings = new ArrayList();
	private int count;
	private double averageRating;
	private int keepCount = 0;
	
	public Video(String title)	{
		this.title = title;
		this.count = 0;
	}
	
	public String getTitle()	{
		return title;
	}
	public int getCount()	{
		return count;
	}
	public void addCount()	{
		count++;
	}
	public boolean addRating(int rating)	{
		if (rating >= 1 && rating <= 5)	{
			ratings.add(getCount(), rating);
			addCount();
			return true;
		}
		else 	{
			System.out.println(rating + " should be between 1 and 5.");
			return false;
		}
	}
	public double getAverageRating()	{
		if (getCount() > 0)	{
			for (int i = keepCount; i < getCount(); i++)	{
				averageRating = averageRating + ((int) (ratings.get(i)));
				keepCount++;
			}
			return (((double) averageRating) / getCount());
		}
		else {
			return 0;
		}
	}
	public boolean checkOut()	{
		if (checked == true)	{
			System.out.println("Video[title=\"" + title + "\", checkedOut=" + checked + "] is already checked out.");
			return false;
		}
		else 	{
			checked = true;
			return true;
		}
	}
	public boolean returnToStore()	{
		if (checked == false)	{
			System.out.println("Video[title=\"" + title + "\", checkedOut=" + checked + "] is not checked out.");
			return false;
		}
		else	{
			checked = false;
			return true;
		}
	}
	public boolean isCheckedOut()	{
		return checked;
	}
	public String toString()	{
		return ("Video[title=\"" + title + "\", checkedOut=" + checked + "]");
	}
	
	public static void main(String[] args){
		Video video = new Video("Herbie");
		video.addRating(3);
		video.addRating(2);
		video.getAverageRating();
	}

}
