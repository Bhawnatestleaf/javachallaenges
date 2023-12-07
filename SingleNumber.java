package javaChallenge4;

public class SingleNumber {
	
	public int singleNumber(int[]nums) {
		int result = 0;
		for(int i:nums) {
		result^=i;
			
		}
		return result;
	}

	public static void main(String[] args) {
	SingleNumber sn = new SingleNumber();
	
	System.out.println(sn.singleNumber(new int[] {2,2,1}));
	System.out.println(sn.singleNumber(new int[] {4,1,2,1,2}));
	System.out.println(sn.singleNumber(new int[] {1}));
	}
	

}
