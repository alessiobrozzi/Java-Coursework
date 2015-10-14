
public class Lens {
	public static Pair[] get(String[] source) {
		Pair[] pairs = new Pair[source.length];
		for (int i = 0; i < source.length; i++)	{
			char init = source[i].charAt(0);
			int length = source[i].length();
			pairs[i] = new Pair(init, length);
		}
		return pairs;
	}
	
	public static String[] create(Pair[] view) {
		String[] str = new String[view.length];
		for (int i = 0; i < view.length; i++)	{
			String xs = "";
			int l = view[i].getInt();
			for (int e = 0; e < l-1; e++)	{
				xs = xs + "X";
			}
			char init = view[i].getChar();
			str[i] = init + xs;
		}
		return str;
	}
	
	public static String[] put(String[] oldSource, Pair[] newView) {
		// Check that the old source and new view have same length.
		// If they do not, report an error and stop the whole program.
		if (!(oldSource.length == newView.length)) {
			throw new RuntimeException("Length of view and source didn't match");
		}
		// if we get here at all, we know oldSource.length == newView.length
		String[] results = new String[oldSource.length];
		for (int i = 0; i < oldSource.length; i++)	{
			if (!(oldSource[i].charAt(0) == newView[i].getChar())) {
				throw new RuntimeException("First characters don't match");
			}
			if (oldSource[i].length() > newView[i].getInt())	{
				String temp = oldSource[i];
				temp = temp.substring(0, newView[i].getInt());
				results[i] = temp;
			}
			else 	{
				String temp = oldSource[i];
				for (int e = 0; e < newView[i].getInt() - oldSource[i].length(); e++)	{
					temp = temp + "X";
				}
				results[i] = temp;
			}
		}
		return results;
	}
	
	public static void main(String[] args)	{
		Pair[] pairs = get(new String[] {"foo", "bar", "froboz"});
		for (Pair i : pairs)	{
			System.out.print(i.toString() + " ");
		}
		System.out.println();
		String[] str = create(new Pair[] {new Pair('f',3), new Pair('b',3), new Pair('f',6)});
		for (String i : str)	{
			System.out.print(i + " ");
		}
		System.out.println();
		String[] res = put(new String[] {"foo", "bar", "froboz"}, new Pair[] {new Pair('f', 3), new Pair('b', 3), new Pair('f', 3)});
		for (String i : res)	{
			System.out.print(i + " ");
		}
		System.out.println();
		res = put(new String[] {"foo", "bar", "froboz"}, new Pair[] {new Pair('f', 3), new Pair('b', 6), new Pair('f', 3)});
		for (String i : res)	{
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
