
public class SplitPathName {

	/**
	 * @param args
	 */
	
	public static String[] splitPath(String s)	{
		String[] str = new String[4];
		int a = s.lastIndexOf('.');
		int b = s.lastIndexOf('/', a);
		str[0] = s.substring(0, b + 1);
		// System.out.println(str[0]);
		str[1] = s.substring(b + 1, s.length());
		// System.out.println(str[1]);
		str[2] = s.substring(b + 1, a);
		// System.out.println(str[2]);
		str[3] = s.substring(a, s.length());
		// System.out.println(str[3]);
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = splitPath(args[0]);
		for (int i = 0; i < str.length; i++)	{
			System.out.println(str[i]);
		}
	}

}
