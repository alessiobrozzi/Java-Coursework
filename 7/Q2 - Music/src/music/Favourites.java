package music;
import java.util.ArrayList;

public class Favourites 	{
	
	// private MusicTrack[] tracks = new MusicTrack[5];
	private ArrayList tracks2 = new ArrayList();
	
	public Favourites()	{
	}
	
	public void addTrack(String artist, String title)	{
			MusicTrack track = new MusicTrack(artist, title);
			// tracks[keep_count] = track;
			tracks2.add(track);
	}
	
	public void showFavourites()	{
		for (int i = 0; i < tracks2.size(); i++)	{
			String spec_track = tracks2.get(i).toString();
			System.out.println(spec_track);
		}
	}

}
