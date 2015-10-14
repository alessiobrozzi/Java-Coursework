
public class Favourites 	{
	
	private MusicTrack[] tracks = new MusicTrack[5];
	private int keep_count = 0;
	
	public Favourites()	{
	}
	
	public void addTrack(String artist, String title)	{
		if (keep_count < 5)	{
			MusicTrack track = new MusicTrack(artist, title);
			tracks[keep_count] = track;
			keep_count++;
		}
		else {
			MusicTrack track = new MusicTrack(artist, title);
			System.out.println("Sorry, can't add: " + track.toString());
		}
	}
	
	public void showFavourites()	{
		for (int i = 0; i < keep_count; i++)	{
			String spec_track = tracks[i].toString();
			System.out.println(spec_track);
		}
	}

}
