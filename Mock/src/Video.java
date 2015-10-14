
public class Video {

	private String title;
	private int ageRating, length;
	
	public Video(String title, int ageRating, int length)	{
		this.title = title;
		this.length = length;
		if (ageRating == 12 || ageRating == 15)	{
			this.ageRating = ageRating;
		}
		else	{
			this.ageRating = 18;
		}
	}
	public String getTitle()	{
		return title;
	}
	public int getAgeRating()	{
		return ageRating;
	}
	public int getLength()	{
		return length;
	}
	public void setAgeRating(int ageRating)	{
		if (ageRating == 12 || ageRating == 15 || ageRating == 18)	{
			this.ageRating = ageRating;
		}
	}
	public void setTitle(String title)	{
		this.title = title;
	}
	public void setLength(int length)	{
		this.length = length;
	}
	public String toString()	{
		return String.format("%s (%d mins), R:%d", title, length, ageRating);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video vid = new Video("star trek", 15, 147);
		System.out.println(vid.toString());
		vid.setAgeRating(20);
		System.out.println(vid.toString());

	}

}
