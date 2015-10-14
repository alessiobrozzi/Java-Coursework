
public class MusicTrack {
	
	public String artist;
	public String title;
	
	public MusicTrack(String artist, String title)	{
		this.artist = artist;
		this.title = title;
	}
	
	public String getArtist()	{
		return artist;
	}
	
	public String getTitle()	{
		return title;
	}
	
	public String toString()	{
		String all = title + " | " + artist;
		return all;
	}

}
