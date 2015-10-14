import java.util.ArrayList;
import java.util.Arrays;

public class OneC {

    public static int hammingDist(String left, String right) {
        int dist = 0;
        for (int i = 0; i < left.length(); i++)	{
        	if (left.charAt(i) != right.charAt(i)){
        		dist++;
        	}
        }
        return dist;
    }

    public static String findFarthest(String s, String[] targets) {
        int index = 0;
        int distMax = 0;
        for (int i =  0; i < targets.length; i++){
        	int dist = hammingDist(s, targets[i]);
        	if (dist > distMax){
        		distMax = dist;
        		index = i;
        	}
        }
        return targets[index];
    }

    public static ArrayList<String> findNearestK(String s, String[] targets, int k) {
        ArrayList<String> results = new ArrayList<String>();
        for (String i : targets)	{
        	int d = hammingDist(s, i);
        	if ( d <= k )	{
        		results.add(i);
        	}
        }
        return results;
    }

    public static int stringDist(String left, String right) {
    	int dist = 0;
        if (left.length() > right.length())	{
        	String left1 = left.substring(0, right.length());
        	String left2 = left.substring(right.length());
        	int length = left2.length();
        	dist = hammingDist(left1, right) + length;
        }
        else if (right.length() > left.length())	{
        	String right1 = right.substring(0, left.length());
        	String right2 = right.substring(left.length());
        	int length = right2.length();
        	dist = hammingDist(right1, left) + length;
        }
        else	{
        	dist = hammingDist(left, right);
        }
        return dist;
    }
    
    public static void main(String[] args){
    	System.out.print(hammingDist("abaca", "abaca") + " ");
    	System.out.print(hammingDist("abaca", "aback") + " ");
    	System.out.print(hammingDist("abaca", "abaft") + " ");
    	System.out.print(hammingDist("abaca", "adapt") + " ");
    	System.out.print(hammingDist("abaca", "accoy") + " ");
    	System.out.print(hammingDist("abaca", "actor") + " ");
    	String[] targets = {"abaca", "aback", "abaft", "adapt", "accoy", "actor"};
    	System.out.print(findFarthest("abaca", targets) + " ");
    	System.out.print(stringDist("heat", "heater") + " ");
    	System.out.print(stringDist("heater", "heat") + " ");
    	System.out.print(stringDist("heat", "hatter") + " ");
    	ArrayList<String> res = new ArrayList<String>();
    	res = findNearestK("abaca", targets, 2);
    	for (String i : res)	{
    		System.out.print(i + " ");
    	}
    }

}