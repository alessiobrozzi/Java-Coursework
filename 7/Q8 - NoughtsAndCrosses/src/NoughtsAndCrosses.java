
public class NoughtsAndCrosses {
	
	private int[][] board = new int[3][3];
	public static final int NONE = 0;
	public static final int NOUGHTS = 1;
	public static final int CROSSES = 2;
	
	public NoughtsAndCrosses(int[][] board)	{
		this.board = board;
	}
	
	public boolean isDraw()	{
		boolean result = false;
		for (int i = 0; i < 3; i++)	{
			if (board[i][0] == board[i][1] && board[i][1] != NONE)	{
				result = result || (board[i][2] == board[i][1]);
			}
			else if (board[0][i] == board[1][i] && board[1][i] != NONE)	{
				result = result || (board[2][i] == board[1][i]);
			}
		}
		if (board[0][0] == board[1][1] && board[1][1] != NONE)	{
			result = result || (board[1][1] == board[2][2]);
		}
		else if (board[0][2] == board[1][1] && board[1][1] != NONE)	{
			result = result || (board[1][1] == board[2][0]);
		}
		return !result;
	}
	public int whoWon()	{
		int result = NONE;
		if (!isDraw())	{
			for (int i = 0; i < 3; i++)	{
				if (board[i][0] == board[i][1] && board[i][1] != NONE)	{
					if (board[i][2] == board[i][1])	{
						result = board[i][2];
					}
				}
				else if (board[0][i] == board[1][i] && board[1][i] != NONE)	{
					if (board[2][i] == board[1][i])	{
						result = board[1][i];
					}
				}
			}
			if (board[0][0] == board[1][1] && board[1][1] != NONE)	{
				if (board[1][1] == board[2][2])	{
					result = board[2][2];
				}
			}
			else if (board[0][2] == board[1][1] && board[1][1] != NONE)	{
				if (board[1][1] == board[2][0])	{
					result = board[1][1];
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args)	{
		int[][] board = { { NONE, NONE, NOUGHTS },
						{ NONE, NONE, NOUGHTS },
						{ NONE, NONE, NOUGHTS }, };

		NoughtsAndCrosses nc = new NoughtsAndCrosses(board);

		System.out.println(nc.isDraw()); // false
		System.out.println(nc.whoWon()); // NOUGHTS
	}

}
