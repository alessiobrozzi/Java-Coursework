
public class Rectangle {
	
	private Point2DDouble topLeft, bottomRight;
	
	public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight)	{
		this.bottomRight = bottomRight;
		this.topLeft = topLeft;
	}
	
	public Rectangle()	{
		topLeft = new Point2DDouble(0, 0);
		bottomRight = new Point2DDouble(1, 1);
	}
	
	public boolean isPointInside(Point2DDouble pt)	{
		boolean x = pt.getX() > topLeft.getX() && pt.getX() < bottomRight.getX();
		boolean y = pt.getY() > topLeft.getY() && pt.getY() < bottomRight.getY();
		return x && y;
	}

}
