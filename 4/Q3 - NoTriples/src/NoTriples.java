
public class NoTriples {

	/**
	 * @param args
	 */
	
	public static boolean noTriples(int[] nums)	{
		boolean result = false;
		
		for (int i = 0; i < (nums.length - 2); i++)	{
			if (nums[i] == nums[i + 1])		{
				result = result || (nums[i + 1] == nums[i + 2]);
			}
		}
		
		return !result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[args.length];
		for (int i = 0; i < args.length; i++)	{
			nums[i] = Integer.parseInt(args[i]);
		}
		System.out.println(noTriples(nums));

	}

}
