import java.util.ArrayList;


public class Table {
	
	ArrayList<Element> table;
	
	public Table(String fn)	{
		readFile(fn);
	}
	public Table()	{
		readFile("elements.csv");
	}
	public void readFile(String fn)	{
		In file = new In(fn);
		while (!file.isEmpty())	{
			String line = file.readLine();
			String[] els = line.split(",");
			int aN = Integer.parseInt(els[1]);
			double w = Double.parseDouble(els[3]);
			Element element = new Element(els[0], aN, els[2], w);
			table.add(element);
		}
	}
	public Element lookup(String sym)	{
		Element result = null;
		for (Element a : table)	{
			if (a.getSym().equals(sym))	{
				result = a;
			}
		}
		return result;
	}
	public void display()	{
		for (Element a : table)	{
			System.out.println(a.toString());
		}
	}

}
