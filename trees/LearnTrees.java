package trees;

class BinaryTreeNode {
	int data;
	BinaryTreeNode left, right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left=right=null;
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
}

public class LearnTrees {
	
	/*
	 *                  1
	 *                /   \ 
	 				2		3
	 			   /
	 			  4
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
		
		System.out.println("\n PreOrder: ");
		tree.postOrder(tree.root);
	}

}
