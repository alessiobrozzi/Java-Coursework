
	public class CoordinateConverter {

	    public static double convertXYtoR(double x, double y) {
	        double R = Math.sqrt(x*x + y*y);
	        return R;
	    }

	    public static double convertXYtoT(double x, double y) {
	        return Math.atan(y / x);
	    }

	    public static double convertRTtoX(double r, double theta) {
	        return r * Math.cos(theta);
	    }

	    public static double convertRTtoY(double r, double theta) {
	        return r * Math.sin(theta);
	    }

	    public static double convertDegToRad(double deg) {
	        return (Math.PI * deg) / 180;
	    }

	    public static double convertRadToDeg(double rad) {
	        return (180 * rad) / Math.PI;
	    }

	}
