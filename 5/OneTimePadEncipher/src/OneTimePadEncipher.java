public class OneTimePadEncipher {
	
	public static boolean isAlpha(char c) {
	  if (c == ' ')	{
		  return false;
	  }
	  else {
		  return true;
	  }
	}
	
    public static int charToInt(char l) {
    	if (isAlpha(l))	{
    		int x = (int) ('A');
    		return (((int) (l)) - x);
    	}
    	else	{
    		return ((int) (l));
    	}
    }

    public static char intToChar(int i) {
      int x = (int) ('a');
      return (char) (i + x);
    }

    public static String encipher(String original, String onetimepad) {
    	int l = 0;
      if (original.length() > onetimepad.length()) {
    	  l = original.length();
      }
      else {
    	  l = onetimepad.length();
      }
      
      int[] first = new int[l];
      int[] key = new int[l];
      char[] f1 = new char[original.length()];
      char[] key_n = new char[onetimepad.length()];
      
      for (int i = 0; i < original.length(); i++)	{
    	  f1[i] = original.charAt(i);
      }
      for (int i = 0; i < onetimepad.length(); i++)		{
    	  key_n[i] = onetimepad.charAt(i);
      }
      for (int i = 0; i < f1.length; i++)	{
    	  first[i] = charToInt(f1[i]);
      }
      for (int i = 0; i < key_n.length; i++)	{
    	  key[i] = charToInt(key_n[i]);
      }
      int[] sum = new int[l];
      for (int i = 0; i < l; i++)	{
    	  sum[i] = first[i] + key[i];
    	  sum[i] = sum[i] % 26;
      }
      char[] ct = new char[l];
      String ciphertext;
      for (int i = 0; i < l; i++)	{
    	  ct[i] = intToChar(sum[i]);
      }
      ciphertext = new String(ct);
      return ciphertext;
    }


    public static void main(String[] args) {
      String ciphertext = encipher("HELLO", "XMCKL");
      System.out.println(ciphertext);
      String answer = OneTimePadDecipher.decipher("uvufsghktdal", "WHATSTHEPASSWORD");
      System.out.println(answer);
    }

}