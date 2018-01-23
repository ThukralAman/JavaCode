package com.gfg.binarytree;


class Node {
	int key;
	Node1 left, right;
	
	Node(int key) {
		this.key = key;
		left=null;
		right=null;
	}
	
	Node() {
		left = null;
		right = null;
	}
}

class BinaryTree {
	Node1 root;
	
	BinaryTree() {
		root = null;
	}
	
	void preOrder(Node1 root) {
		if(root==null) 
			return;
		
		System.out.print(root.key + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	void postOrder(Node1 root) {
		if(root==null) 
			return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key + " ");
	}
	
	void inOrder(Node1 root) {
		if(root==null) 
			return;
		
		inOrder(root.left);
		System.out.print(root.key + " ");
		inOrder(root.right);
	}
	
}

public class DepthFirstTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree  bt = new BinaryTree();
		bt.root = new Node1(4);
		bt.root.left = new Node1(2);
		bt.root.right = new Node1(5);
		bt.root.left.left = new Node1(1);
		bt.root.left.right = new Node1(3);
		
		bt.preOrder(bt.root);
		System.out.println();
		bt.postOrder(bt.root);
		System.out.println();
		bt.inOrder(bt.root);

	}

}
