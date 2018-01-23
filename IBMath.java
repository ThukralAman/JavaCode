import java.util.ArrayList;

public class IBMath {

	public static void main(String args[]) {
		IBMath obj = new IBMath();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(9);
		int res = obj.solve(l1, 5, 42950);
		System.out.println("res = " + res );
		
		
	}
	
	public int[] getArrFromList(ArrayList<Integer> A) {
		int[] arr = new int[A.size()];
		for(int i=0; i<A.size(); i++) {
			arr[i] = A.get(i);
		}
		return arr;
	}
	
	public int[] getDigitArray(int num) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int temp = num, rev=0, countDigit = 0;
		/*while(temp!=0) {
			rev = rev*10 + temp%10;
			temp = temp/10;
		}*/
		while(temp!=0) {
			temp = temp/10;
			countDigit++;
		}
		int temp1 = num;
		
		for(int i =countDigit-1; i>=0; i-- ) {
			numList.add(temp1/(int)(Math.pow(10, i)));
			temp1 = temp1%(int)(Math.pow(10, i));
		}
		
		return getArrFromList(numList);
	}
	
	public int solve(ArrayList<Integer> A, int B, int C) {
		int result = 0;
		int[] digits = getArrFromList(A),
		digitArray = getDigitArray(C),
		lower = new int[10];
		for(int i=0; i<digitArray.length; i++) {
			System.out.println("i" + i + "digits" + digitArray[i]);
		}
		
		System.out.println("digitArray.length = " + digitArray.length);
		
		if(A.size() ==0 || B > digitArray.length) {
			return 0;
		}
		
		else if(B<digitArray.length) {
			if(digits[0] == 0 && B!=1) {
				return ((int)Math.pow(digits.length-1, B-1) * (digits.length-1));
			}
			else{
				return (int)Math.pow(digits.length, B);
			}
		}
		else{
			System.out.println("inside if----------------");
			int[] dp = new int[digitArray.length+1];
			dp[0] = 0;
			System.out.println("dp_length = " + dp.length);
			System.out.println("digitArray_length = " + digitArray.length);
			System.out.println("digits_length = " + digits.length);
			for(int i=0; i<digits.length; i++) {
				if(digits[i] == 9) {
					//lower[digits[i]]++;
				}
				else{
					lower[digits[i] + 1]++;
				}
			}
			for(int i = 0; i<lower.length; i++) {
				System.out.println("lower i = " + i + ":  = " + lower[i]);
			}
			System.out.println("beforeeee");
			for(int i=1; i<lower.length; i++) {
				lower[i] = lower[i] + lower[i-1];
			}
			
			for(int i = 0; i<lower.length; i++) {
				System.out.println("lower i = " + i + ":  = " + lower[i]);
			}
			for(int i=1; i<=digitArray.length; i++) {
				
				if(i==1 ) {
					dp[i] = (dp[i-1] * digits.length) + lower[digitArray[i-1]];
					if(lower[1]==1 && B!=1){
						dp[i]--;
					}
					
				}
				else{
					if(dp[i-1] ==0) {
						dp[i] = 0;
					}
					else{
						dp[i] = (dp[i-1] * digits.length) + lower[digitArray[i-1]];
					}
				}
				System.out.println("dp[" +i + "] = " + dp[i]);
			}
			return dp[digitArray.length];
			
		}
	}
}
