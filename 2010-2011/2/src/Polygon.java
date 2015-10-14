import java.util.ArrayList;


public class Polygon {
	
	private Vector[] vectors;
	
	public Polygon(Vector[] vectors){
		this.vectors = vectors;
	}
	
	public Vector[] getVectors()	{
		return vectors;
	}
	public double perimeter()	{
		double perimeter = 0;
		for (Vector i : vectors)	{
			perimeter = perimeter + i.magnitude();
		}
		return perimeter;
	}
	public boolean isClosed()	{
		int x = 0;
		int y = 0;
		for (Vector i : vectors)	{
			x = x + i.getXDisp();
			y = y + i.getYDisp();
		}
		return (x== 0 && y == 0);
	}
	public double area()	{
		if (!isClosed())	{
			return 0;
		}
		else {
			ArrayList<Point> points = new ArrayList<Point>();
			int x = 0;
			int y = 0;
			for (Vector i : vectors)	{
				x = x + i.getXDisp();
				y = y + i.getYDisp();
				Point p = new Point(x,y);
				points.add(p);
			}
			double area = 0;
			for (int i = 0; i < points.size() - 1; i++)	{
				double p1 = points.get(i).getX() * points.get(i + 1).getY();
				double p2 = points.get(i).getY() * points.get(i + 1).getX();
				double s = p1 - p2;
				area = area + s;
			}
			area = area / 2;
			area = Math.abs(area);
			return area;
		}
	}
	public Point[] boundingBox()	{
		ArrayList<Point> points = new ArrayList<Point>();
		int x = 0;
		int y = 0;
		Point p1 = new Point();
		points.add(p1);
		for (Vector i : vectors)	{
			x = x + i.getXDisp();
			y = y + i.getYDisp();
			Point p = new Point(x,y);
			points.add(p);
		}
		Point max = new Point();
		Point min = new Point();
		max = points.get(0).makeMax(points.get(1));
		min = points.get(0).makeMin(points.get(1));
		for (int i = 0; i < points.size(); i++)	{
			max = max.makeMax(points.get(i));
			min = min.makeMin(points.get(i));
		}
		Point[] p = {min, max};
		return p;
	}

}