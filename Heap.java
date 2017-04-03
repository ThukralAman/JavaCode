import java.util.Scanner;

/* 
 * 
 * Property(Max Heap): Parent is always greater than its child + tree is almost complete binary tree with leaves being added from left most node
 *  - Can be represented in array with:
 *	- parent i=0, child1 = (2*i+1) child2 =(2*i+2)
 *
 * */

public class Heap {
	int num[];
	int heapSize;
	// int num[] = {33, 2, 98, 79, 104, 65, 56, 7, 43, 28};
	// int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	// int heapSize = num.length;
	Utils utils = new Utils();

	Heap(int num[]) {
		this.num = num;
		this.heapSize = num.length;
		System.out.println("heapSize = " + this.heapSize);

	}

	public static void main(String args[]) {
		int num[] = { 33, 2, 98, 79, 104, 65, 56, 7, 43, 28 };
		Heap h = new Heap(new int[] { 33, 2, 98, 79, 104, 65, 56, 7, 43, 28 });
		h.printHeapArray();

		h.createHeap();
		System.out.println("After creating heap:");
		System.out.println();
		h.printHeapArray();

		Heap h1 = new Heap(new int[] { 33, 2, 98, 79, 104, 65, 56, 7, 43, 28 });
		h1.createHeap();
		int max = h1.extractMax();
		System.out.println("After extracting max:");
		System.out.println();
		System.out.println("max" + max);
		h1.printHeapArray();

		Heap h2 = new Heap(new int[] { 33, 2, 98, 79, 104, 65, 56, 7, 43, 28 });
		h2.createHeap();
		System.out.println("After increasing key [8]->72:");
		System.out.println();
		h2.increaseKey(8, 72);
		h2.printHeapArray();

		Heap h3 = new Heap(new int[] { 33, 2, 98, 79, 104, 65, 56, 7, 43, 28 });
		h3.createHeap();
		System.out.println("After decreasing key [1]->0");
		System.out.println();
		h3.decreaseKey(1, 0);
		h3.printHeapArray();

		Heap h4 = new Heap(new int[] { 33, 2, 98, 79, 104, 65, 56, 7, 43, 28 });
		System.out.println("Applying heapsort");
		System.out.println();
		h4.heapSort();
		h4.printArray();
	}

	public void printHeapArray() {
		System.out.println("##### Printing Heap Array ######");
		for (int i = 0; i < heapSize; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println("");
		System.out.println("#### DONE ######");
		System.out.println("");
	}

	public void printArray() {
		System.out.println("##### Printing Array ######");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println("");
		System.out.println("#### DONE ######");
		System.out.println("");
	}

	/*
	 * Time complexity of max heap creation = O(n) Number of nodes at level h =
	 * (N / ( 2^(H+1) ) ) where leaves have height=0, their parents have height
	 * h=1
	 * 
	 * see: https://www.youtube.com/watch?v=HI97KDV23Ig Now time complexity =
	 * summation from h=1 to h=H ( ( n/(2^(h+1)) ) * O(h) ) = summation from h=1
	 * to h=H ( ( n/(2^h*2) ) * ch ) = summation from h=1 to h=H ( ( n/(2^(h+1))
	 * ) * O(h) )
	 * 
	 * Also see Keep Notes
	 * 
	 */

	/* Heap array goes from 0..n-1 & n=total number of elements */

	/*
	 * Algo: 1) Since heapify bears the responsibility of heapifying the given
	 * index and any associated child index if affected 2) So in create heap we
	 * start from first non leaf node and call heapify from that index down to
	 * zero. 3) We start from first non-eaf node because all leaf nodes are
	 * already following heap property and dont need to be heapified.
	 *
	 */
	public void createHeap() {
		int n = heapSize;
		for (int i = ((n / 2) - 1); i >= 0; i--) {
			heapify(num, i, n);
		}
	}

	/*
	 * Algo: 1) create heap out of given unsorted arry 2) Replace num[0] with
	 * num[n-1] 3) Reduce heap size by 1. heapSize = heapSize-1 4) heapify index
	 * -> 0 (O(log(n))) 5) go to step 2)
	 */
	public void heapSort() {
		createHeap();
		while (heapSize > 0) {
			utils.swap(num, 0, heapSize - 1);
			heapSize -= 1;
			heapify(num, 0, heapSize);
		}
	}

	/*
	 * Algo: 1) Max = heap[0] 2) swap index 0 with heapSize-1. 3) Reduce size of
	 * array by 1 4) Heapify heap for i=0
	 */
	public int extractMax() {
		int max = num[0];
		utils.swap(num, 0, (num.length - 1));
		heapSize = num.length - 1;
		heapify(num, 0, heapSize);
		return max;
	}

	public int getParent(int i) {
		return (i - 1) / 2;
	}

	// COMPLEXITY : O(logn)
	public void increaseKey(int i, int key) {
		int index = i;
		if (key < num[i]) {
			System.out.println("Key is smaller than already present value");
			return;
		}
		num[i] = key;
		while (index > 0 && num[getParent(index)] < num[index]) {
			utils.swap(num, index, getParent(index));
			index = getParent(index);
		}
	}

	public void decreaseKey(int i, int key) {
		if (key > num[i]) {
			System.out.println("Key is greater than value present at index");
			return;
		}
		num[i] = key;
		heapify(num, i, heapSize);
	}

	/*
	 * Time complexity of heapify = O(logn) Space complexity: O(logn) Note n =
	 * number of nodes in subtree where i is the root 1. Heapify function
	 * converts the given index to heap property 2. In this process if it finds
	 * that it swaps some value at child index, then it also heapifies the
	 * swapping index 3. It heapifies the swapping child index assuming that the
	 * swapping index was also a heap.
	 *
	 * Improvement TO DO: can avoid passing int[] to heapify
	 */
	public void heapify(int num[], int i, int n) {
		int largest = i, l = 2 * i + 1, r = 2 * i + 2;

		if (l < n && num[largest] < num[l]) {
			largest = l;
		}

		if (r < n && num[largest] < num[r]) {
			largest = r;
		}

		if (largest != i) {
			utils.swap(num, i, largest);
			heapify(num, largest, n);
		}
	}

}
