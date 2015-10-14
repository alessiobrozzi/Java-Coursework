
public class ArrayRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[args.length];
		int[] copy = new int[args.length];
		
		for (int i = 0; i < args.length; i++)	{
			nums[i] = Integer.parseInt(args[i]);
		}
		for (int i = 0; i < (args.length-1); i++)	{
			copy[i] = nums[i+1];
		}
		copy[ args.length - 1 ] = nums[ 0 ] ;
		for (int i = 0; i < args.length; i++)	{
			System.out.print(copy[i] + " ");
		}
		System.out.println();

	}

}
