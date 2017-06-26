package com.ib.array;

import java.util.ArrayList;
import java.util.List;

public class RepeatNMissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    ArrayList<Integer> res = new ArrayList<Integer>(); 
	    long sumNArr = 0, sumNActual = 0;
	    long sumNSquareArr=1, sumNSquareActual = 1;
	    long diffN=0,  diffNsquare=0;
	    long xOriginal, yReplaced;
	    for(int i=0; i<a.size(); i++) {
	        sumNArr += a.get(i); 
	        sumNSquareArr += a.get(i) * a.get(i);
	    }
	    
	    for(int i=0; i<a.size(); i++) {
	        sumNActual += i+1;
	        sumNSquareActual += (i+1) * (i+1);
	    }
	    
	    diffN = sumNArr - sumNActual;
	    //System.out.println("diffN" + diffN);
	    //yReplaced - xOriginal = diffN; -(1)
	    //yReplaced = diffN + xOriginal; 
	    
	    diffNsquare = sumNSquareArr - sumNSquareActual;
	    //System.out.println("" + );
	    //System.out.println("diffNsquare" + diffNsquare);
	    //(yReplaced) ^2 - xOriginal ^2 = diffNsquare
	    //(yReplaced + xOriginal) * (yReplaced - xOriginal) = diffNsquare
	    //(yReplaced + xOriginal) = (diffNsquare/diffN) - (2)
	    //Adding (1) & (2)
	    //2 * yReplaced = ((diffNsquare/diffN) + diffN)
	    yReplaced = ( ((diffNsquare/diffN) + diffN) /2);
	    xOriginal = (yReplaced - diffN);
	    res.add((int)yReplaced);
	    res.add((int)xOriginal);
	    return res;
  
 	}

}
