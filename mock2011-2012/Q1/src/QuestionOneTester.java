import java.util.HashMap;

public class QuestionOneTester {

    public static void main(String[] args) {
    	int[] nums = {3,5,7,9};
        System.out.println(OneA.geometricMean(nums));
        int[] nums2 = {1,0,0,0,1,0,1,1,1};
        System.out.println(OneB.longestSeq(nums2, 0));
        System.out.println(OneC.findStringCounts("abcdabcd"));
    }
}
