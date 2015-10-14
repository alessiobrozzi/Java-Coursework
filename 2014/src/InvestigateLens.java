
public class InvestigateLens {

	public static boolean checkPutGet(String[] lenses)	{
		String[] s = Lens.put(lenses, Lens.get(lenses));
		return s.equals(lenses);
	}
	
	public static void main(String[] args) {
		String[] s1 = {"FOO"};
		String[] s2 = {"foo", "BAR", "frObOz" };
		String[] s3 = {"foo", "bar", "FROBOZ" };
		System.out.print(checkPutGet(s1) + " " + checkPutGet(s2) + " " + checkPutGet(s3));

	}

}
