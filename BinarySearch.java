import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
		int num[] = new int[10],
			searchNum,
			low = 0, mid, high = num.length;
		boolean found=false;
		
		/*A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. 
		 The resulting tokens may then be converted into values of different types using the various next methods*/
		Scanner sc = new Scanner(System.in); 
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
		}
		searchNum = sc.nextInt();
		
		while(low <= high){
			mid = (low + high) /2;
			if (searchNum == num[mid]) {
				found = true;
				break;
			}
			else if( searchNum < num[mid] ) {
				high = mid;
			}
			else {
				low = mid;
			}
		}	
		
		if(found) {
			System.out.println("Found your requested number : " + searchNum);
		}
		else{
			System.out.println("Sorry your requested number" + searchNum + "could not be found");
		}
		sc.close();
	}

}
