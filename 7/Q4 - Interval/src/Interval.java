
public class Interval {
	
	private double left;
	private double right;
	
	public Interval(double left, double right)	{
		this.left = left;
		this.right = right;
	}
	public boolean doesContain(double x)	{
		boolean l = x > left;
		boolean r = x < right;
		return (l && r);
	}
	public boolean isEmpty()	{
		return left > right;
	}
	public boolean isEmpty(Interval b)	{
		return b.left > b.right;
	}
	public boolean intersects(Interval b)	{
		if (isEmpty())	{
			return false;
		}
		else if (isEmpty(b))	{
			return false;
		}
		else if (b.left >= left && b.left <= right){
			return true;
		}
		else if (b.right >= left && b.right <= right)	{
			return true;
		}
		else {
			return b.left <= left && b.right >= right;
		}
	}
	public String toString()	{
		if (!isEmpty())	{
			return ("Interval: [" + left + ", " + right + "]");
		}
		else 	{
			return ("Interval: (EMPTY)");
		}
	}

}
