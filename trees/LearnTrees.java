package trees;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode {
	int data;
	BinaryTreeNode left, right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left=right=null;
	}
	
	public boolean hasLeft() {
		return this.left !=null ? true : false;  
	}
	
	public boolean hasRight() {
		return this.right !=null ? true : false;  
	}
}

class BinaryTree {
	
	BinaryTreeNode root;
	
	BinaryTree() {
		root = null;
	}
	
	BinaryTree(int data) {
		root = new BinaryTreeNode(data);
	}
	
	public void preOrder(BinaryTreeNode root) {
		if(root==null)
			return;
		else {
			System.out.print(root.data + ", ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	public void inOrder(BinaryTreeNode root) {
		if(root==null)
			return;
		else {
			inOrder(root.left);
			System.out.print(root.data + ", ");
			inOrder(root.right);
		}
	}
	
	public void postOrder(BinaryTreeNode root) {
		if(root==null)
			return;
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + ", ");
		}
	}
	
	public void BFS(BinaryTreeNode root) {
		/*
		 *  1. Add the root in queue
		 *  2. Loop over queue until it gets empty:
		 *  	a) remove first element in queue and print that element
		 *  	b) If removed element has left/right children, add them to queue
		 *  
		 *  LinkedList class implements Queue interface. Methods are: 
		 *  add(Integer e) : Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
		 *  peek() : Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
		 *  poll() : Retrieves and removes the head of this queue, or returns null if this queue is empty.
		 *  isEmpty() : Returns true if this collection contains no elements
		 */
		
		Queue<BinaryTreeNode> q = new LinkedList();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			BinaryTreeNode removedElement = q.poll();
			System.out.print(removedElement.data + ", ");
			
			if(removedElement.left != null) {
				q.add(removedElement.left);
			}
			
			if(removedElement.right != null) {
				q.add(removedElement.right);
			}
		}
		
		
		
	}
}

public class LearnTrees {
	
	/*
	 *                  1
	 *                /   \ 
	 				2		3
	 			   /
	 			  4
	 			  
			PreOrder: 
			1, 2, 4, 3, 
			 InOrder: 
			4, 2, 1, 3, 
			 PostOrder: 
			4, 2, 3, 1, 
			 BFS: 
			1, 2, 3, 4, 
 */

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.left = new BinaryTreeNode(2);
		tree.root.right = new BinaryTreeNode(3);
		tree.root.left.left = new BinaryTreeNode(4);
		
		System.out.println("\n PreOrder: ");
		tree.preOrder(tree.root);
		
		System.out.println("\n InOrder: ");
		tree.inOrder(tree.root);
		
		System.out.println("\n PostOrder: ");
		tree.postOrder(tree.root);
		
		System.out.println("\n BFS: ");
		tree.BFS(tree.root);
		
	}

}
