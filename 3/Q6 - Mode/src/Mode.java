
public class Mode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] dataset = new int[args.length];
		int[] count = new int[10];
		
		/*for (int i = 0; i < args.length; i++)	{
			count[i] = 0;
		} */
		for (int i = 0; i < args.length; i ++)	{
			dataset[i] = Integer.parseInt(args[i]);
		}
		for (int i = 0; i < args.length; i++)	{
			for (int e = 0; e < 10; e++)	{
				if (dataset[i] == e)	{
					count[e]++;
				}
			}
			
		}
		for (int i = 0; i < 10; i++)	{
			System.out.print("[" + i + "s: " + count[i] + "]");

			for (int points = 1; points <= count[i]; points++)	{
				if (points == 1)	{ 
					System.out.print(" ");
				}
				System.out.print(".");
			}
			System.out.println();
		}	
		
		int max = -1, pos = -1;
		for (int i = 0; i < 10; i++)	{
			if (count[i] > max)		{
				max = count[i];
				pos = i;
			}
			
		}
			
		System.out.println("Mode: " + pos);

	}

}
