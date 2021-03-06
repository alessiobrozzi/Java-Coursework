public class OneB {
 
     public static double[] movingAvg(double[] data, int len) {
         int N = data.length - len;
         double[] avg = new double[N+1];
         for (int i = 0; i <= N; i++)	{
        	 double sum = 0;
        	 for (int e = i; e < len + i; e++)	{
        		 sum = sum + data[e];
        	 }
        	 sum = sum / len;
        	 avg[i] = sum;
         }
         return avg;
     }
     
     public static void main(String[] args)	{
    	 double[] d1 = {11,12,13,14,15,16,17};
    	 double[] d2 = {3,3,6,2,8,9};
    	 double[] d3 = {22.27,22.19,22.08,22.17,22.18,22.13,22.23,22.43};
    	 double[] o1 = movingAvg(d1,5);
    	 double[] o2 = movingAvg(d2,3);
    	 double[] o3 = movingAvg(d3,5);
    	 for (double i : o1)	{
    		 System.out.format("%.2f ", i);
    	 }
    	 System.out.println();
    	 for (double i : o2)	{
    		 System.out.format("%.2f ", i);
    	 }
    	 System.out.println();
    	 for (double i : o3)	{
    		 System.out.format("%.2f ", i);
    	 }
    	 System.out.println();
     }
 }