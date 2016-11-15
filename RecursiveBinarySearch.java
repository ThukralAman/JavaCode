import java.util.Scanner;

public class RecursiveBinarySearch {
	
	
	boolean bs(int num[], int searchNum, int low, int high) {
		boolean found=false;
		if (low <= high) {
			int mid = (low+high) / 2;
			if (searchNum == num[mid]){
				return true;
			}
			else if(searchNum < num[mid]) {
				found = bs(num, searchNum, low, mid-1);
			}
			else {
				found = bs(num, searchNum, mid+1, high);
			}
		}
		
		return found;
	}
	
	public static void main(String args[]) {
		RecursiveBinarySearch rbs = new RecursiveBinarySearch();
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
			found = rbs.bs(num, searchNum, 0, num.length);
			
			if(found) {
				System.out.println("Found your requested number : " + searchNum);
			}
			else{
				System.out.println("Sorry your requested number : " + searchNum + ", could not be found");
			}
			sc.close();
	}
}
