import java.util.Arrays;


public class Tokenizer {
	
	private String[] tokens = {};
	
	public Tokenizer()	{
		// do nothing
	}
	public Tokenizer(String fname)	{
		tokensFromFile(fname);
	}
	
	public void tokenize(String str)	{
		tokens = str.split("\\W+");
	}
	public void tokensFromFile(String fname)	{
		In file = new In(fname);
		String text = file.readAll();
		tokenize(text);
	}
	public String[] getTokens()	{
		return tokens;
	}
	public int getNumberTokens()	{
		return tokens.length;
	}
	
}