public class OneA {
 
     public static double harmonicMean(int[] nums) {
         int n = nums.length;
         double sum = 0;
         for (int i : nums)	{
        	 sum = sum + 1 / (double) i;
         }
         return n / sum;
     }
     
     public static void main(String[] args)	{
    	 int[] a1 = {1,2,3};
    	 int[] a2 = {1,2,4};
    	 int[] a3 = {3,5,7,9};
    	 System.out.println(harmonicMean(a1));
    	 System.out.println(harmonicMean(a2));
    	 System.out.println(harmonicMean(a3));
     }
 }