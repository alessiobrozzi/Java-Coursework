public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
       boolean[] values = new boolean[4];
       for (int i = 0; i < 4; i++)		{
    	   values[i] = false;
       }
       if (nums.length >= 4)	{
    	   for (int i = 0; i < 4; i ++)		{
    		   values[i] = nums[i] == 9;
    	   }
       }
       else if (nums.length == 0)	{
    	   return false;
       }
       else {
    	   for (int i = 0; i < nums.length; i++)	{
    		   values[i] = nums[i] == 9;
    	   }
       }
       return values[0] || values[1] || values[2] || values[3];
    }

    public static void main(String[] args) {
        int N = args.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }
}