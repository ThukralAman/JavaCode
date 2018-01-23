package com.ib.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MySort implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
		String s1 = Integer.toString(a);
		String s2 = Integer.toString(b);
		String res1 = s1 + s2;
		String res2 = s2+s1;
		return res1.compareTo(res2);
		/*Integer res1int = Integer.parseInt(res1);
		Integer res2int = Integer.parseInt(res2);
		if(res1int > res2int) {
			return 1;
		}
		else if(res2int > res1int) {
			return -1;
		}
		else {
			return 0;
		}*/
		
	}
}

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LargestNumber obj  = new LargestNumber();
		List<Integer> l = new ArrayList<Integer>();
		final List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(3,30,34,5,9));
		String res = obj.largestNumber(l1);
		System.out.println(res);
		
	}
	
	
	

	

	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
		MySort ms = new MySort();
		String res = "";
		
		Collections.sort(a, ms);
		for(int i=a.size()-1; i>=0; i--) {
			res = res + Integer.toString(a.get(i));
		}
		
		
		return res;
	    
	    
	}
}
