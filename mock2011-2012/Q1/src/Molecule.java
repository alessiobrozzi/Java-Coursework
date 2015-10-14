import java.util.ArrayList;
import java.util.HashMap;


public class Molecule {
	
	private HashMap<Element, Integer> structure = new HashMap<Element, Integer>();
	private Table table = new Table();
	
	public Molecule() {
		
	}
	
	public void addAtom(String sym, int num)	{
		Element element = table.lookup(sym);
		structure.put(element, num);
	}
	public void addAtom(String sym){
		Element element = table.lookup(sym);
		structure.put(element, 1);
	}
	public ArrayList<Element> atoms()	{
		ArrayList<Element> atoms = new ArrayList<Element>();
		for (Element i : structure.keySet())	{
			atoms.add(i);
		}
		return atoms;
	}
	public double weigth()	{
		double tw = 0;
		for (Element i : atoms())	{
			double w = i.getWeight();
			Integer n = structure.get(i);
			tw = tw + w * n;
		}
		return tw;
	}

}
