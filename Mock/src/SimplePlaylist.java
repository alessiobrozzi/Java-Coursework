import java.util.ArrayList;


public class SimplePlaylist extends Video {

	private ArrayList<Video> videos;
	public SimplePlaylist(String title, int ageRating, int length) {
		super(title, ageRating, length);
		videos = new ArrayList<Video>();
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePlaylist sp = new SimplePlaylist("trek", 15, 200);
		ArrayList<Video> vids = new ArrayList<Video>();
		vids.add(new Video("star trek", 15, 150));
		sp.setVideos(vids);
		System.out.println(sp.toString());

	}

}
