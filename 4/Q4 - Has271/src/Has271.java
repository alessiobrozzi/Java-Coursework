
public class Has271 {

	/**
	 * @param args
	 */
	
	public static boolean has271(int[] nums)	{
		boolean result = false;
		for (int i = 0; i < (nums.length - 2); i++)		{
			if (nums[i + 1] == nums[i] + 5)	{
				result = result || (nums[i + 2] == nums[i] - 1);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[args.length];
		for (int i = 0; i < args.length; i++)	{
			nums[i] = Integer.parseInt(args[i]);
		}
		
		System.out.println(has271(nums));

	}

}
