package trees;
import java.util.Stack;

import trees.LearnTrees;

public class LearnIterativeDFT {
	
	public void preOrderIterative(BinaryTreeNode root) {
		Stack<BinaryTreeNode> st = new Stack<>();
		st.push(root);
		while(!st.isEmpty()) {
			BinaryTreeNode popped = st.pop();
			System.out.print(popped.data + ", ");
			
			if(popped.right != null) {
				st.push(popped.right);
			}

			if(popped.left != null) {
				st.push(popped.left);
			}
		}
	}
	
	public void inOrderIterative(BinaryTreeNode root) {
		Stack<BinaryTreeNode> st = new Stack<>();
		
		if(root==null) return;
		
		while(root!=null) {
			st.push(root);
			root = root.left;
		}
		
		while(!st.isEmpty()) {
			BinaryTreeNode popped = st.pop();
			System.out.print(popped.data + ", ");
			
			if(popped.right != null) {
				BinaryTreeNode tempRight = popped.right;
				st.push(tempRight);
				while(tempRight.left!=null) {
					st.push(tempRight.left);
					tempRight = tempRight.left;
				}
			}
		}
	}
	
	public void postOrderIterative(BinaryTreeNode root) {
		Stack<BinaryTreeNode> st = new Stack<>();
		BinaryTreeNode lastPoppedNode = null;
		
		if(root==null) return;
		
		while(root!=null) {
			st.push(root);
			root=root.left;
		}
		
		while(!st.isEmpty()) {
			BinaryTreeNode peekedNode = st.peek();
			if(peekedNode.hasRight()) {
				// While understanding skip this if initially as it gets evaluated on this special case.
				if(lastPoppedNode == peekedNode.right) {
					lastPoppedNode = st.pop();
					System.out.print(lastPoppedNode.data +  ", ");
					continue;
				}
				BinaryTreeNode tempRight = peekedNode.right;
				st.push(tempRight);
				while(tempRight.left!=null) {
					st.push(tempRight.left);
					tempRight = tempRight.left;
				}
			}else {   //
				lastPoppedNode = st.pop();
				System.out.print(lastPoppedNode.data + ", ");
			}
		}
	}
	
	
	/*
	 *										1
	 *										/\									
	 *									2		3
	 *									/\
	 *								4		5
	 *										/							
	 * 									6
	 * 									\
	 * 										7
	 * 										/\
	 * 									8		9
	 * 
	 * 	1, 2, 4, 5, 6, 7, 8, 9, 3, 
		 And iterative version result:
		1, 2, 4, 5, 6, 7, 8, 9, 3, 
		
		4, 2, 6, 8, 7, 9, 5, 1, 3, 
		 Iterative inorder: 
		4, 2, 6, 8, 7, 9, 5, 1, 3, 
		
		4, 8, 9, 7, 6, 5, 2, 3, 1, 
		 Iterative post order: 
		4, 8, 9, 7, 6, 5, 2, 3, 1, 
	 */
	public static void main(String[] args) {
		LearnIterativeDFT obj = new LearnIterativeDFT();
		
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.left = new BinaryTreeNode(2);
		tree.root.right= new BinaryTreeNode(3);
		tree.root.left.left = new BinaryTreeNode(4);
		tree.root.left.right = new BinaryTreeNode(5);
		tree.root.left.right.left = new BinaryTreeNode(6);
		tree.root.left.right.left.right = new BinaryTreeNode(7);
		tree.root.left.right.left.right.left = new BinaryTreeNode(8);
		tree.root.left.right.left.right.right = new BinaryTreeNode(9);

		tree.preOrder(tree.root);
		System.out.println("\n And iterative version result:");
		obj.preOrderIterative(tree.root);
		
		System.out.println("\n");
		
		tree.inOrder(tree.root);
		System.out.println("\n Iterative inorder: ");
		obj.inOrderIterative(tree.root);
		
		System.out.println("\n");
		
		tree.postOrder(tree.root);
		System.out.println("\n Iterative post order: ");
		obj.postOrderIterative(tree.root);
		
	}

}
