import java.util.ArrayList;
import java.util.HashMap;

public class OneC {

    public static ArrayList<String> findSubstrings(String s, int len) {
    	ArrayList<String> tokens = new ArrayList<>();
        for (int i = 0; i <= s.length() - len; i++)	{
        	String token = s.substring(i, i+len);
        	tokens.add(token);
        }
        return tokens;
    }

    public static void increment(HashMap<String, Integer> map, String s) {
        Integer value = map.get(s);
        if (value == null)	{
        	map.put(s, 1);
        }
        else	{
        	map.put(s, value+1);
        }
    }
    
    public static HashMap<String, Integer> findStringCounts(String s) {
        HashMap<String, Integer> freq = null;
        ArrayList<String> tokens = findSubstrings(s, 3);
        for (String sub : tokens)	{
        	increment(freq, sub);
        }
        return freq;
    }
    
}
