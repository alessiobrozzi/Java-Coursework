public class Factorial {
	
   public static int factorial(int N) {
	   int nFac = 1;
        for (int i = 1; i <= N; i++)	{
        	nFac = nFac * i;
        }
        return nFac;
    }

    public static void main(String[] args) {
    	int N = Integer.parseInt(args[0]);
    	factorial(N);
        System.out.print(" 2! (Should be: 2) returned: " + factorial(2) );
        System.out.print(" 5! (Should be: 120) returned: " + factorial(5) );
        System.out.print(" 10! (Should be: 3628800) returned: " + factorial(10) );
    }
}