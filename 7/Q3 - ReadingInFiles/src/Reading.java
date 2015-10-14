
public class Reading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* In file = new In("http://www.gutenberg.org/files/39063/39063-0.txt");
		while (!file.isEmpty()) {
		    String line = file.readLine();
		    if (line.contains("mountain")) {
		        System.out.println(line);
		    }
		}
		*/
		In file2 = new In("FavouritesTest.java.txt");
		String s = file2.readAll();
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++)	{
			System.out.println(words[i]);
		}

	}

}
