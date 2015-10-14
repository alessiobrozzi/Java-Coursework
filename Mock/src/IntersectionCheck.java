import java.awt.geom.*;
import java.util.ArrayList;

public class IntersectionCheck {

	public static boolean linesIntersect(Line line1, Line line2){
		if (!(line1.equals(line2)))	{
			double x1 = line1.getX1();
			double y1 = line1.getY1();
			double x2 = line1.getX2();
			double y2 = line1.getY2();
			double x3 = line2.getX1();
			double y3 = line2.getY1();
			double x4 = line2.getX2();
			double y4 = line2.getY2();
			return Line2D.linesIntersect(x1, y1, x2, y2, x3, y3, x4, y4);
		}
		else	{
			return false;
		}
	}
	public static Line[] getIntersections(Line currentLine, Line[] allLines)	{
		ArrayList<Line> lines = new ArrayList<Line>();
		for (Line l : allLines)	{
			if (linesIntersect(currentLine, l)){
				lines.add(l);
			}
		}
		Line[] line_inter = new Line[lines.size()];
		for (int i = 0; i < lines.size(); i++)	{
			line_inter[i] = lines.get(i);
		}
		return line_inter;
	}
	public static String printLine(Line segment)	{
		return String.format("(%.1f, %.1f) to (%.1f, %.1f)", segment.getX1(), segment.getY1(), segment.getX2(), segment.getY2());
	}
	public static String printIntersections(Line[] allLines)	{
		String result = "";
		for (Line l : allLines)	{
			if (getIntersections(l, allLines).length != 0)	{
				result += "Line " + printLine(l) + " intersects with:\n";
				Line[] inters = getIntersections(l, allLines);
				for (Line i : inters)	{
					result += printLine(i) + "\n";
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line[] lines = {new Line(0,0,2,0), new Line(1,1,1,-1), new Line(0,0,1,1)};
		System.out.println(printIntersections(lines));
	}

}
