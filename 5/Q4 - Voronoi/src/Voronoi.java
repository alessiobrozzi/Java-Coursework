import java.awt.Color;

public class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
        double d1 = (point1.getX() - point2.getX()) * (point1.getX() - point2.getX());
        double d2 = (point1.getY() - point2.getY()) * (point1.getY() - point2.getY());
        double distance = Math.sqrt(d1 + d2);
        return distance;
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
    	int min = 0;
    	double[] distances = new double[sites.length];
        for (int i = 0; i < sites.length; i++)	{
        	distances[i] = pointDist(point, sites[i]);
        }
        double[] dist2 = new double[sites.length];
        for (int i = 0; i < sites.length; i++)	{
        	dist2[i] = distances[i];
        }
        double min2 = distances[0];
        for (int i = 0; i < (sites.length - 1); i++)	{
        	if (distances[i] > distances[i+1])	{
        		min2 = distances[i+1];
        	}
        	else {
        		min2 = distances[i];
        		distances[i+1] = distances[i];
        	}
        }
        for (int i = 0; i < sites.length; i++)	{
        	if (min2 == dist2[i])	{
        		min = i;
        	}
        }
        return min;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        int[][] indexmap = new int[width][height];
        for (int i = 0; i < width; i++)	{
        	for (int e = 0; e < height; e++)	{
        		Point2D p = new Point2D(i,e);
        		indexmap[i][e] = findClosestPoint(p, sites);
        	}
        }
        return indexmap;
    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
    	int width = indexMap.length;
    	int height = indexMap[0].length;

    	StdDraw.setCanvasSize(width, height);
    	StdDraw.setXscale(0, width);
    	StdDraw.setYscale(0, height);
    	
    	indexMap = buildVoronoiMap(sites, width, height);
    	
    	for (int i = 0; i < width; i++)	{
    		for (int e = 0; e < height; e++)	{
    			Point2D p = new Point2D(i, e);
    			int min = findClosestPoint(p, sites);
    			if (i != sites[min].getX() || e != sites[min].getY()) {
    				StdDraw.setPenColor(colors[indexMap[i][e]]);
    				StdDraw.point(i, e);
    			}
    			else {
    				StdDraw.setPenColor();
    				StdDraw.point(i, e);
    			}
    		}
    	}
    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        int nSites = 5;
        Point2D[] sites = new Point2D[nSites];
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);

        Color[] colors = new Color[nSites];
        colors[0] = Color.BLUE;
        colors[1] = Color.GREEN;
        colors[2] = Color.YELLOW;
        colors[3] = Color.ORANGE;
        colors[4] = Color.MAGENTA;

        int[][] indexmap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexmap);

    }

}