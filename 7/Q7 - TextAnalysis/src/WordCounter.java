import java.util.Collection;
import java.util.HashMap;

public class WordCounter {
	
	private HashMap<Integer, Integer> couples = new HashMap<Integer, Integer>();
	
	public WordCounter(String[] tokens)	{
		wordLengthFreq(tokens);
	}
	
	public void wordLengthFreq(String[] tokens)	{
		couples.clear();
		for (int i = 0; i < tokens.length; i++)	{
			Integer tlength = tokens[i].length();
			Integer count = couples.get(tlength);
			if (count != null)	{
				couples.put(tlength, count + 1);
			}
			else	{
				couples.put(tlength, 1);
			}
		}
	}
	public HashMap<Integer, Integer> getFreqDist()	{
		return couples;
	}
	public int maxVal()	{
		int max = 0; 
		for (int i : couples.values())	{
			 if (i > max)	{
				 max = i;
			 }
		}
		return max;
	}
	public double[] map2array()	{
		if (couples.size() == 0)	{
			return new double[] {};
			}
		int maxKey = -1;
		for (int i : couples.keySet())	{
			if (i > maxKey)	{
				maxKey = i;
			}
		}
		double[] frequencies = new double[maxKey+1];
		for (int i = 0; i < frequencies.length; i++)	{
			Integer f = couples.get(i);
			if (f == null)	{
				frequencies[i] = 0;
			}
			else {
				frequencies[i] = (((double) f) / maxVal()) * 100;
			}
		}
		return frequencies;
	}
	
	public static void main (String[] args){
		Tokenizer tokenizer = new Tokenizer("melville-moby_dick.txt");
		String [] tokens = tokenizer.getTokens();
		WordCounter wc = new WordCounter(tokens);
		double[] valori = wc.map2array();
		for (double i : valori)	{
			System.out.print(i +" ");
		}
	}

}
