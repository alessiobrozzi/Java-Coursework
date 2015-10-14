public class Lens {
	public static Pair[] get(String[] source) {
		Pair[] pairs = new Pair[source.length];
		for (int e = 0; e < source.length; e++)	{
			int ups = 0;
			for (int i = 0; i < source[e].length(); i++)	{
				char c = source[e].charAt(i);
				if (Character.isUpperCase(c))	{
					ups++;
				}
			}
			Pair pair = new Pair(source[e].charAt(0), ups);
			pairs[e] = pair;
		}
		return pairs;
	}
	
	public static String[] create(Pair[] view) {
		String[] results = new String[view.length];
		for (int i = 0; i < view.length; i++)	{
			String temp = "" + view[i].getChar();
			for (int e = 0; e < view[i].getInt(); e++)	{
				temp += "X";
			}
			results[i] = temp;
		}
		return results;
	}
	
	public static String[] put(String[] oldSource, Pair[] newView) {
		// Check that the old source and new view have same length.
		// If they do not, report an error and stop the whole program.
		if (!(oldSource.length == newView.length)) {
			throw new RuntimeException("Length of view and source didn't match");
		}
		// if we get here at all, we know oldSource.length == newView.length
		Pair[] pairs = get(oldSource);
		String[] results = new String[pairs.length];
		for (int i = 0; i < oldSource.length; i++)	{
			char c1 = oldSource[i].charAt(0);
			char c2 = newView[i].getChar();
			if (!(Character.toLowerCase(c1) == Character.toLowerCase(c2))) {
				throw new RuntimeException("First characters don’t match");
			}
			else	{
				int i1 = pairs[i].getInt();
				int i2 = newView[i].getInt();
				if (i1 < i2)	{
					String temp = oldSource[i];
					for (int e = i1; e < i2; e++)	{
						temp += "X";
					}
					results[i] = temp;
				}
				else	{
					results[i] = oldSource[i];
				}
			}
		}
		return results;
	}
	
	public static void main(String[] args)	{
		Pair[] pairs = get(new String[] {"foo", "BAR", "frObOz"});
		for (Pair p : pairs)	{
			System.out.println(p.toString());
		}
		String[] res = create (new Pair[]{new Pair('F',2), new Pair('b',0), new Pair('f',5)});
		for (String r : res)	{
			System.out.print(r + " ");
		}
		System.out.println();
		String[] r1 = put(new String[] {"foo", "BAR", "frObOz"}, new Pair[] {new Pair('f',2), new Pair('b',0), new Pair('f',5)});
		String[] r2 = put(new String[] {"foo", "bar", "FROBOZ"}, new Pair[] {new Pair('f',1), new Pair('b',6), new Pair('f',3)});
		for (String r : r1)	{
			System.out.print(r + " ");
		}
		System.out.println();
		for (String r : r2)	
			System.out.print(r + " ");
	}
}
