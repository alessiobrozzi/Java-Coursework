
public class NMax {

	/**
	 * @param args
	 */
	
	public static int max(int a, int b, int c)	{
		int max;
		if (a > b)	{
			max = a;
			if (c > a) {
				max = c;
			}
		}
		else {
			max = b;
			if (c > b)	{
				max = c;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		
		System.out.println(max(a,b,c));
		

	}

}