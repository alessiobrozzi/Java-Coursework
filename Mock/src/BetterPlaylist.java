import java.util.ArrayList;


public class BetterPlaylist extends Video {
	private ArrayList<Video> videos;

	public BetterPlaylist(String title, int ageRating, int length) {
		super(title, ageRating, length);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Video> getVideos()	{
		return videos;
	}
	public void setVideos(ArrayList<Video> videos)	{
		this.videos = videos;
	}
	public String toString()	{
		String result = String.format("%s (%d mins), R:%d", getTitle(), getLength(), getAgeRating());
		result += "\nShowing:";
		for (Video v : videos){
			result += "\n" + v.toString();
		}
		return result;
	}
	public int getLength()	{
		int length = 0;
		for (Video v : videos)	{
			length += v.getLength();
		}
		return length;
	}
	public int getAgeRating()	{
		int max = 12;
		for (Video v : videos)	{
			if (v.getAgeRating() > max)	{
				max = v.getAgeRating();
			}
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
