package intv.gs;

import java.util.HashMap;

/*
 * 
 * #recursion CCI 6th edition
 * Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
steps at a time. Implement a method to count how many possible ways the child can run up the
stairs
 */

public class Staircase { 
	int countWaysToClimbStairs(int stairs) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=4; i<=stairs; i++) {
			hm.put(i, -1);
		}
		return countWaysToClimbStairs(stairs, hm);
	}
	
	int countWaysToClimbStairs(int stairs, HashMap<Integer, Integer> hm) {
		System.out.println("calculating for  = " + stairs);
		if(stairs == 0) {
			return 0;
		}else if(stairs==1) {
			return 1;
		}else if(stairs==2) {
			return 2;
		}else if(stairs == 3) {
			return 4;
		}else{
			if(hm.get(stairs) != -1) {
				System.out.println("found easy way for stair = " + stairs);
				return hm.get(stairs);
			}else{
				int ways =  countWaysToClimbStairs(stairs-1, hm) + countWaysToClimbStairs(stairs-2, hm) + countWaysToClimbStairs(stairs-3, hm);
				hm.put(stairs, ways);
				return ways;
			}
		}
	}

	public static void main (String args[]) {
		// TODO Auto-generated method stub

		Staircase obj = new Staircase();
		
		int testStairs = 4;
		int result = obj.countWaysToClimbStairs(testStairs);
		System.out.println("Num of ways: " + result);
		System.out.println("Num of ways for " + 36 + " = " + obj.countWaysToClimbStairs(67));
	}
}
