
public class Point {
	
	private int x, y;
	
	public Point(int x, int y)	{
		this.x = x;
		this.y = y;
	}
	public Point()	{
		x = 0;
		y =0;
	}
	
	public int getX()	{
		return x;
	}
	public int getY()	{
		return y;
	}
	public Point makeMax(Point p)	{
		int x1 = x;
		int y1 = y;
		int x2 = p.getX();
		int y2 = p.getY();
		int m_x = Math.max(x1, x2);
		int m_y = Math.max(y1, y2);
		Point n = new Point(m_x,m_y);
		return n;
	}
	public Point makeMin(Point p)	{
		int x1 = x;
		int y1 = y;
		int x2 = p.getX();
		int y2 = p.getY();
		int m_x = Math.min(x1, x2);
		int m_y = Math.min(y1, y2);
		Point n = new Point(m_x,m_y);
		return n;
	}

}
