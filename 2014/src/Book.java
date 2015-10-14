import java.util.ArrayList;


public class Book extends Document {
	
	private ArrayList<Document> chapters;

	public Book(String name, int pages) {
		super(name, pages);
		 chapters = new ArrayList<Document>();
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Document> getChapters()	{
		return chapters;
	}
	public void setChapters(ArrayList<Document> chapters)	{
		this.chapters = chapters;
	}
	public String toString()	{
		String result = getName() + " (" + getPages() + ")\nContains:";
		for (Document d : chapters)	{
			result += "\n" + d.toString();
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("all about stamps", 300);
		ArrayList<Document> docs = new ArrayList<Document>();
		docs.add(new Document("stamp collecting", 15));
		book.setChapters(docs);
		System.out.print(book.toString());

	}

}
