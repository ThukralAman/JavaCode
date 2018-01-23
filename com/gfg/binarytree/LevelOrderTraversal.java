package com.gfg.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
	int key;
	Node1 left, right;
	
	Node1(int key) {
		this.key = key;
		left=null;
		right=null;
	}
	
	Node1() {
		left = null;
		right = null;
	}
}

class BinaryTree1 {
	Node1 root;
	
	BinaryTree1() {
		root = null;
	}

	void breadthFirstTraversal(Node1 root) {
		Queue<Node1> q = new LinkedList<Node1>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node1 temp = q.poll();
			System.out.print(temp.key + " ");
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
		
	}
}

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree1  bt = new BinaryTree1();
		bt.root = new Node1(1);
		bt.root.left = new Node1(2);
		bt.root.right = new Node1(3);
		bt.root.left.left = new Node1(4);
		bt.root.left.right = new Node1(5);
		
		bt.breadthFirstTraversal(bt.root);

	}

}
