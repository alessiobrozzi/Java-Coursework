
public class MeanVariance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] set = new double[args.length];
		double sum = 0;
		
		for (int i = 0; i < args.length; i++)	{
			set[i] = Double.parseDouble(args[i]);
			sum = sum + Double.parseDouble(args[i]);
		}
		
		double mean = sum / args.length;
		
		double sum2 = 0;
		
		for (int i = 0; i < args.length; i++)	{
			sum2 = sum2 + (set[i] - mean)*(set[i] - mean);
		}
		double variance = sum2 / args.length;
		
		System.out.println(mean);
		System.out.println(variance);

	}

}
