
public class Element {
	private String element, sym;
	private int atomicNum;
	private double weigth;
	
	public Element(String element, int atomicNum, String sym, double weight)	{
		this.atomicNum = atomicNum;
		this.element = element;
		this.sym = sym;
		this.weigth = weigth;
	}
	
	public String getElement()	{
		return element;
	}
	public String getSym()	{
		return sym;
	}
	public int getAtomicNum()	{
		return atomicNum;
	}
	public double getWeight()	{
		return weigth;
	}
	public String toString()	{
		String str = String.format("Element(%s, %s, %s, %.2f\n", element, atomicNum, sym, weigth);
		return str;
	}

}
