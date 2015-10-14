public class OneB {

    public static double meanColSums(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double mean = 0;
        int[] sums = new int[cols];
        for (int i = 0; i < cols; i++)	{
        	int sum = 0;
        	for (int e = 0; e < rows; e++)	{
        		sum = sum + matrix[e][i];
        	}
        	mean = mean + sum;
        }
        return mean / cols;
        
        
    }
    
    public static void main(String[] args){
    	int[][] m1 = {{12,1},{2,5},{8,1}};
    	int[][] m2 = {{12,1,14},{2,5,5},{8,1,2}};
    	int[][] m3 = {{1,0,0,0,0}};
    	int[][] m4 = {{0}};
    	System.out.println(meanColSums(m1));
    	System.out.println(meanColSums(m2));
    	System.out.println(meanColSums(m3));
    	System.out.println(meanColSums(m4));
    }
}