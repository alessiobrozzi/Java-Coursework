
public class Circle {
	
	private Point2DDouble centre;
	private double radius;
	
	public Circle(Point2DDouble centre, double radius)	{
		this.centre = centre;
		this.radius = radius;
	}
	public Circle()	{
		centre = new Point2DDouble(0, 0);
		radius = 1;
	}
	public boolean isPointInside(Point2DDouble pt)	{
		double distance = Point2DDouble.distance(pt, centre);
		return radius > distance;
	}

}
