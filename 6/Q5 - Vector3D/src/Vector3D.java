
public class Vector3D {
	
	private double x, y, z;
	private double r, theta, phi;
	
	public Vector3D(double x, double y, double z)	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getR()	{
		r = Math.sqrt(x*x + y*y + z*z);
		return r;
	}
	public double getTheta()	{
		theta = Math.acos(z / getR());
		return theta;
	}
	public double getPhi()	{
		if (y == 0)	{
			if (x > 0)	{
				phi = Math.atan(y / x);
			}
			else if (x < 0)	{
				phi =  (Math.atan(y / x) + Math.PI);
			}
		}
		else if (x == 0)	{
			if (y > 0)	{
				phi = Math.PI / 2;
			}
			else	{
				phi = (Math.PI / 2) * (-1);
			}
		}
		else {
			phi = Math.atan(y / x);
		}
		return phi;
	}
	public static Vector3D add(Vector3D lhs, Vector3D rhs)	{
		double x = lhs.x + rhs.x;
		double y = lhs.y + rhs.y;
		double z = lhs.z + rhs.z;
		Vector3D vec = new Vector3D(x, y, z);
		return vec;
	}
	public static Vector3D subtract(Vector3D lhs, Vector3D rhs)	{
		double x = lhs.x - rhs.x;
		double y = lhs.y - rhs.y;
		double z = lhs.z - rhs.z;
		Vector3D vec = new Vector3D(x, y, z);
		return vec;
	}
	public static Vector3D scale( Vector3D v, double scaleFactor)	{
		double x = v.x;
		double y = v.y;
		double z = v.z;
		Vector3D vec = new Vector3D(x * scaleFactor, y * scaleFactor, z * scaleFactor);
		return vec;
	}

}
