
public class NbyN {

	/**
	 * @param args
	 */
	
	public static int[][] nbyn(int N)	{
		int[][] matrix = new int[N][N];
		for (int i = 0; i < N; i++)	{
			for (int e = 0; e < N; e++)	{
				if (i != e)	{
					matrix[i][e] = 0;
				}
				else {
					matrix[i][e] = i;
				}
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(args[0]);
		nbyn(N);
		for (int i = 0; i < N; i++)	{
			for (int e = 0; e < N; e++)	{
				System.out.print(nbyn(N)[i][e] + " ");
			}
			System.out.println();
		}

	}

}
