
import java.util.Arrays;

public class TempMedian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if( args.length < 1)	{
			System.out.println("fjfj");
			return;
		}
		
		int initial = Integer.parseInt(args[0]);
		int n = args.length;
		int[] temps = new int[args.length];
		temps[0] = initial;
		System.out.print(temps[0]);
		
		for (int i = 1; i < n; i++)	{
			if (args[i].compareTo(".") == 0) 	{
				temps[i] = temps[i - 1];
			}
			else if (args[i].compareTo("+") == 0)	{
				temps[i] = temps[i - 1] + 1;
			}
			else if (args[i].compareTo("-") == 0)	{
				temps[i] = temps[i - 1] - 1;
			}
			System.out.print(" " + temps[i]);
		}
		System.out.println();
		
		Arrays.sort(temps);
		
		for (int i = 0; i < n; i++)		{
			if (i != (n-1))		{
			System.out.print(temps[i] + " ");
			}
			else {
				System.out.print(temps[i]);
			}
		}
		System.out.println();
		
		double median = 0;
		
		if (n % 2 == 0)	{
			double x1 = temps[(n - 1) / 2];
			double x2 = temps[(n-1)/2 + 1];
			median = (x1 + x2) / 2;
		}
		else 	{
			double x1 = temps[(n - 1) / 2];
			median = x1;
		}
		
		System.out.println(median);

	}

}
