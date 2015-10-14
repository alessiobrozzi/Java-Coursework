import java.util.ArrayList;
 
 public class OneC {
 
     public static String[] getDomainLabels(String url) {
         int nPos = url.lastIndexOf('/');
         
    	 String sub = url.substring(0, nPos);
         String[] splits = sub.split("\\.");
         return splits;
     }
 
     public static void reverseArray(String[] labels) {
         for (int i = 0; i < labels.length / 2; i++)	{
        	 String temp1 = labels[i];
        	 String temp2 = labels[labels.length - 1 - i];
        	 labels[i] = temp2;
        	 labels[labels.length - 1 - i] = temp1;
         }
     }
 
     public static String arrayToString(String[] labels) {
         String result = "";
         for (int i = 0; i < labels.length - 1; i++)	{
        	 result = result + labels[i] + '.';
         }
         if (!labels.equals(null))	{
        	 result = result + labels[labels.length - 1];
         }
         return result;
     }
 
     public static ArrayList<String> textToReversedDomains(String filename) {
    	 ArrayList<String> urls = new ArrayList<String>();
         StdIn.redirectInput(filename);
         while (!StdIn.isEmpty())	{
        	 String line = StdIn.readLine();
        	 String[] labels = getDomainLabels(line);
        	 reverseArray(labels);
        	 String url = arrayToString(labels);
        	 urls.add(url);
         }
         return urls;
     }
     
     public static void main(String[] args)	{
    	 String[] splits = getDomainLabels("www.GROUPON.co.uk/Edinburgh+Coupons");
    	 for (String i : splits)	{
    		 System.out.print(i + " ");
    	 }
    	 System.out.println();
    	 reverseArray(splits);
    	 for (String i : splits)	{
    		 System.out.print(i + " ");
    	 }
    	 ArrayList<String> urls = textToReversedDomains("text.txt");
    	 for (String i : urls)	{
    		 System.out.println(i);
    	 }
     }
 
 }