import java.util.ArrayList;


public class Dalek2 extends Dalek1 {
	
	private ArrayList sayings = new ArrayList();
	
	public Dalek2()	{
	}
	
	public void addSaying(String s)	{
		int length = sayings.size();
		sayings.add(length,s);
	}
	
	public void setSayings(String[] s)	{
		for (int i = 0; i < s.length; i++)	{
			addSaying(s[i]);
		}
	}
	
	public void speak()	{
		int random = (int) (Math.random() * (sayings.size()));
		sayings.get(random);
		System.out.println(sayings.get(random));
	}

}
