public class OneB {
  
    public static int longestSeq(int[] nums, int n) {
    	int max = 0;
    	int prov = 0;
        if (nums.length == 0)	{
        	return 0;
        }
        for (int i = 0; i < nums.length; i++){
        	if (nums[i] == n)	{
        		int e = i;
        		while (nums[e] == n)	{
        			prov++;
        			e++;
        		}
        		if (prov > max)	{
        			max = prov;
        			prov = 0;
        		}
        		else {
        			prov = 0;
        		}
        	}
        }
        return max;
    }
}
