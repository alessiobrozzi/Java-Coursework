public class ArrayOps {
	
	public static double[] data;

    public static double findMax(double[] data) {
        if (data.length == 0)	{
        	return 0;
        }
        else {
        	double max = data[0];
        	for (int i = 0; i < (data.length - 1); i++)	{
        		if (data[i] > data[i + 1])	{
        			max = data[i];
        			data[i + 1] = max;
        		}
        		else {
        			max = data[i + 1];
        		}
        	}
        	return max;
        }
    }

    public static double[] normalise(double data[]) {
        double[] newA = new double[data.length];
        double sum = 0;
        double temp;
        for (int i = 0; i < data.length; i++)	{
        	sum = sum + data[i];
        }
        for (int i = 0; i < data.length; i++)	{
        	temp = data[i];
        	newA[i] = temp / sum;
        }
        return newA;
    }

    public static void normaliseInPlace(double data[]) {
        double sum = 0;
        for (int i = 0; i < data.length; i++)	{
        	sum += data[i];
        }
        for (int i = 0; i < data.length; i++)	{
        	data[i] = data[i] / sum;
        }
    }

    public static double[] reverse(double[] data) {
        int l = data.length;
        double[] newA = new double[data.length];
        if (l == 1)	{
        	return data;
        }
        else {
        	for (int i = 0; i < l/2; i++)	{
        		newA[l - i - 1] = data[i];
        		newA[i] = data[l - i - 1];
        	}
        	return newA;
        }
    }

    public static void reverseInPlace(double[] data) {
    	int l = data.length;
        double temp;
        for (int i = 0; i < l/2; i++)	{
        	temp = data[l - i - 1];
        	data[l - i - 1] = data[i];
        	data[i] = temp;
        }
    }

    public static void swap(double[] data1, double[] data2) {
        double temp1 = 0, temp2 = 0;
        for (int i = 0; i < data1.length; i++)	{
        	temp1 = data1[i];
        	temp2 = data2[i];
        	data1[i] = temp2;
        	data2[i] = temp1;
        }
    }

}