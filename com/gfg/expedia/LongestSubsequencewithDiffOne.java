package com.gfg.expedia;

/*
 * To find the maximum length of the subsequence 
 * from a given array of integers with difference between the elements as either 0 or 1.
 */

public class LongestSubsequencewithDiffOne {
	
	int longestSubSequence(int num[]) {
		int i=0; 
		int start=0, end=0, max=0, count=0;
		
		while(i < num.length-1) {
			
			if((num[i+1] == num[i] + 1) || num[i+1] == num[i] ) {
				start = i;
				count=1;
				while((num[i+1] == num[i] + 1) || num[i+1] == num[i] ) {
					i++;
					count++;
				}
			}
			
			
			if(count > max) {
				max = count;
			}
			i++;
		}
		
		
		return max;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1, 4, 6, 8, 8, 9, 11, 12, 13, 14, 15, 18}; 
		LongestSubsequencewithDiffOne obj = new LongestSubsequencewithDiffOne();
		int result = obj.longestSubSequence(num);
		System.out.println(result);

	}

}
