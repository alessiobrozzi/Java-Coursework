
public class InvestigateLens {
	
	public static boolean checkGetPut(String[] source, Pair[] view)	{
		String[] results = Lens.put(source, view);
		Pair[] pairs = Lens.get(results);
		boolean check = true;
		for (int i = 0; i < pairs.length; i++)	{
			boolean comp = pairs[i].equals(view[i]);
			check = check && comp;
		}
		return check;
	}
	
	public static void main(String[] args)	{
		String[] s1 = {"foo"};
		String[] s2 = {"foo", "bar", "froboz"};
		Pair[] p1 = {new Pair('f',7)};
		Pair[] p2 = {new Pair('f',7), new Pair('b',3), new Pair('f',6)};
		Pair[] p3 = {new Pair('f',2), new Pair('b',5), new Pair('f',3)};
		boolean a = checkGetPut(s1, p1);
		boolean b = checkGetPut(s2, p2);
		boolean c = checkGetPut(s2, p3);
		boolean d = a && b && c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
