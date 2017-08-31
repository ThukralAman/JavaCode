package com.gfg.expedia;


//http://www.geeksforgeeks.org/vertical-sum-in-a-given-binary-tree/
/*
 * Given a Binary Tree, find vertical sum of the nodes that are in same vertical line. Print all sums through different vertical lines.

Examples:

      1
    /   \
  2      3
 / \    / \
4   5  6   7
The tree has 5 vertical lines

Vertical-Line-1 has only one node 4 => vertical sum is 4
Vertical-Line-2: has only one node 2=> vertical sum is 2
Vertical-Line-3: has three nodes: 1,5,6 => vertical sum is 1+5+6 = 12
Vertical-Line-4: has only one node 3 => vertical sum is 3
Vertical-Line-5: has only one node 7 => vertical sum is 7

So expected output is 4, 2, 12, 3 and 7
 * 
 */



import java.util.HashMap;

class Node {
	int key;
	Node left, right;
	
	Node(int key) {
		left = null;
		right = null;
		this.key = key;
	}
}

class BinaryTree {
	Node root;
	
	BinaryTree() {
		root = null;
	}
	
	void verticalSum(Node root) {
		if(root== null) {
			return;
		}
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		verticalSumUtil(root, 0, hm);
		if(hm!=null) {
			System.out.println(hm.entrySet());
		}
	}
	
	void verticalSumUtil(Node root, int index, HashMap<Integer, Integer> hm ) {
		if(root == null) {
			return;
		}
		
		verticalSumUtil(root.left, index-1, hm);
		int prevVal = (hm.get(index) == null) ? 0 : hm.get(index);
		hm.put(index, prevVal + root.key);
		verticalSumUtil(root.right, index+1, hm);
		
	}
	
	
}

public class VerticalSumTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);

		bt.verticalSum(bt.root);
		

	}

}
