
public class Position {

	private int lineNo, pageNo;
	public Position()	{
		lineNo = 1;
		pageNo = 1;
	}
	public int getPageNo()	{
		return pageNo;
	}
	public int getLineNo()	{
		return lineNo;
	}
	public void setPageNo(int pageNo)	{
		this.pageNo = pageNo;
	}
	public void setLineNo(int lineNo)	{
		if (lineNo > 0 && lineNo <= 25)	{
			this.lineNo = lineNo;
		}
	}
	public void advance(int n)	{
		if (n > 0)	{
			pageNo += (lineNo + n) / 25;
			lineNo += (lineNo + n) % 25;
		}
	}
	public String toString()	{
		return String.format("Page:  %d Line:  %d", pageNo, lineNo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Position pos = new Position();
		pos.advance(24);
		System.out.println(pos.toString());
		pos.advance(10);
		System.out.println(pos.toString());

	}

}
