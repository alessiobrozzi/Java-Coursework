
public class OneA {
	
	public static int prodOfPairs(int[] nums)	{
		if (nums.length % 2 != 0)	{
			return -1;
		}
		else if (nums.length == 0)	{
			return 0;
		}
		else	{
			int product = 0;
			int i =  0;
			while (i < nums.length - 1)	{
				product = product + nums[i] * nums[i+1];
				i = i + 2;
			}
			return product;
		}
	}
	
	public static void main(String[] args){
		int[] n1 = {1,2,3,4};
		int[] n2 = {3,5,7,5,-2,4};
		int[] n3 = {};
		int[] n4 = {1,2,3};
		System.out.println(prodOfPairs(n1));
		System.out.println(prodOfPairs(n2));
		System.out.println(prodOfPairs(n3));
		System.out.println(prodOfPairs(n4));
	}

}
