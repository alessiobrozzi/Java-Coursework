public class OneA {

    public static double geometricMean(int[] nums) {
    	if (nums.length == 0)	{
    		return 0;
    	}
        int product = 1;
        for (int i = 0; i < nums.length; i++)	{
        	product = product * nums[i];
        }
        double gm = Math.pow(product, 1.0/nums.length);
        return gm;
    }
}
