/**
 * 
 */

/**
 * @author amthukra
 *
 */
public class ArraysJava {
	public static void main(String args[]){
		int arr[] = new int[10];
		
		for (int i=0 ; i<arr.length; i++){
			System.out.print(arr[i] +  " ");
		}
		
		/**  multi dimensional array**/
		System.out.println("\n**  multi dimensional array** ");
		int multidarr[][] = new int [3][2];
		multidarr[0][0] = 2;
		for (int i=0 ; i<multidarr.length; i++){
			for(int j=0; j<multidarr[i].length; j++ )
			System.out.print(multidarr[i][j] +  " ");
		}
		
		/** Jagged Array **/
		System.out.println("\n** Jagged Array **");
		int jaggedArr[][] = new int [3][];
		jaggedArr[0] = new int[2];
		jaggedArr[1] = new int[3];
		jaggedArr[2] = new int[4];
		
		/**  Initializing single and multi dimensional arrays **/
		System.out.println("\n**  Initialising single and multi dimensional arrays **");
		int iArr[] = {1,2,3,4};
		for (int i=0 ; i<iArr.length; i++){
			System.out.print(iArr[i] +  " ");
		}
		
		/** Initializing multidimensional array **/
		System.out.println("\n** Initializing multidimensional array **");
		int mArr[][] = {{1,2,3},
						{4,5},
						{6,7,8,9}
					    }; 
		for (int i=0 ; i<mArr.length; i++){
			for(int j=0; j<mArr[i].length; j++ )
			System.out.print(mArr[i][j] +  " ");
			System.out.println("\n");
		}
	}
}
