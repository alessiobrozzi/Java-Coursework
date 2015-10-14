
public class OneTimePadDecipher {
	public static String decipher(String original, String onetimepad) {
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
    	  Character.toUpperCase(f1[i]);
    	  first[i] = OneTimePadEncipher.charToInt(f1[i]);
      }
      for (int i = 0; i < key_n.length; i++)	{
    	  Character.toUpperCase(key_n[i]);
    	  key[i] = OneTimePadEncipher.charToInt(key_n[i]);
      }
      int[] sum = new int[l];
      for (int i = 0; i < l; i++)	{
    	  sum[i] = first[i] - key[i];
    	  if (sum[i] < 0)	{
    		  sum[i] = sum[i] + 26;
    		  sum[i] = sum[i] % 26;
    	  }
    	  else {
    		  sum[i] = sum[i] % 26;
    	  }
      }
      char[] ct = new char[l];
      String ciphertext;
      for (int i = 0; i < l; i++)	{
    	  ct[i] = OneTimePadEncipher.intToChar(sum[i]);
      }
      ciphertext = new String(ct);
      return ciphertext;
    }

}
