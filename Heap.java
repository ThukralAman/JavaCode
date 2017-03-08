import java.util.Scanner;

/* 
 * 
 * Property(Max Heap): Parent is always greater than its child + tree is almost complete binary tree with leaves being added from left most node
 *  - Can be represented in array with:
 *	- parent i=0, child1 = (2*i+1) child2 =(2*i+2)
 * */


public class Heap {
	int num[] = {33, 2, 198, 89, 1004, 65, 56789, 7, 43, 765};
	
	public static void main(String args[]) {
		Heap h = new Heap();
		/*int num[] = {33, 2, 198, 89, 1004, 65, 56789, 7, 43, 765};
		int n = num.length;*/
		
		h.printHeapArray();
		h.createHeap();
		
		/*for(int i=0; i<num.length; i++) {
			System.out.println(num[i] + ',');
		}*/
		
		/*for(int i=((n/2)-1); i>=0; i--) {
			h.heapify(num, i, n);
		}*/
		
		System.out.println("After heapifying:");
		System.out.println();
		h.printHeapArray();
	}
	
	public void printHeapArray() {
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
	public void createHeap() {
		int n = num.length;
		for(int i=((n/2)-1); i>=0; i--) {
			heapify(num, i, n);
		}
	}
	public void heapify(int num[], int i, int n) {
		Utils utils = new Utils();
		int largest = i,
				l = 2*i+1,
				r = 2*i+2;
		 
		if( l<n && num[largest] < num[l]){
			largest = l;
		}
		
		if(r<n  && num[largest] < num[r]) {
			largest = r;
		}
		
		if(largest!=i) {
			utils.swap(num, i, largest);
			heapify(num, largest, n);
		}
	}
	
}
