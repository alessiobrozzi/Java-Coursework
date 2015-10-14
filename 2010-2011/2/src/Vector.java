
public class Vector {
	
	private int xdisp, ydisp;
	
	public Vector(int xdisp, int ydisp){
		this.xdisp = xdisp;
		this.ydisp = ydisp;
	}
	
	public int getXDisp()	{
		return xdisp;
	}
	public int getYDisp()	{
		return ydisp;
	}
	public double magnitude()	{
		double sum = xdisp * xdisp + ydisp * ydisp;
		return Math.sqrt(sum);
	}
	public Point translate(Point p)	{
		int x = xdisp + p.getX();
		int y = ydisp + p.getY();
		Point r = new Point(x,y);
		return r;
	}

}
