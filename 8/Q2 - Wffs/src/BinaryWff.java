
public class BinaryWff {
	
	protected PropVar right, left;
	protected Operator operator;
	
	public BinaryWff(PropVar left, PropVar right)	{
		this.right = right;
		this.left = left;
	}
	public void setOp(Operator op)	{
		this.operator = op;
	}
	public Operator getOp()	{
		return operator;
	}
	public PropVar getLeft()	{
		return left;
	}
	public PropVar getRight()	{
		return right;
	}
	public String toString()	{
		return ("(" + left + " " + operator + " " + right + ")");
	}

}
