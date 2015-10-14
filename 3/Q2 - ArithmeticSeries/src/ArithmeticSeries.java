
public class ArithmeticSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = Integer.parseInt(args[0]);
		int i = 1;
		int sum = 0;
		while (i <= N) 	{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
