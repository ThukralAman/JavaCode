package com.gfg.expedia;

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
