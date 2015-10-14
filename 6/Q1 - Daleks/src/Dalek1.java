
public class Dalek1 {
	
	private double batteryCharge = 5.0; // instance variable
	
	public Dalek1()	{
	}

    public void batteryReCharge(double c) {
        batteryCharge = batteryCharge + c;
        System.out.println("batteryCharge is " + batteryCharge);
    }

    public void move(int distance) {
        if (batteryCharge >= 0.5)	{
        	if (2 * batteryCharge >= distance)	{
        		for (int i = 1; i <= distance; i++)	{
        			batteryCharge = batteryCharge - 0.5;
        			System.out.print("[" + i + "]  ");
        		}
        		System.out.println();
        	}
        	else {
        		for (int i = 1; i < distance; i++)	{
        			batteryCharge = batteryCharge - 0.5;
        			System.out.print("[" + i + "]  ");
        		}
        		System.out.println("out of power");
        	}
        }
        else {
        	System.out.println("out of power");
        }
    }

}
