package com.tree.solutions;

import com.tree.solutions.BinaryTree.Node;

/*
 * Given a tree -
 * 						   1
 * 					/			\
 * 					3			2
 * 				/		\	/		\
 * 				7		6	5		4
 * 				\		   / \
 * 				10		  9   8
 * 
 * Find common ancestor.
 * Input: 9 & 4
 * Output: 2
 */
public class CommonAncester {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(3);
		bt.root.right = new Node(2);
		bt.root.left.left = new Node(7);
		bt.root.left.right = new Node(6);
		bt.root.right.left = new Node(5);
		bt.root.right.right = new Node(4);
		bt.root.left.left.right = new Node(10);
		bt.root.right.left.left = new Node(9);
		bt.root.right.left.right = new Node(8);

		int ancestor = findAncestor(bt.root, 9, 4);
		System.out.println("Output: " + ancestor);
	}

	private static int findAncestor(Node root, int childOne, int childTwo) {
		if (root == null) {
			return 0;
		}
		if (root.data == childOne || root.data == childTwo) {
			return 1;
		}
		int left = findAncestor(root.left, childOne, childTwo);
		int right = findAncestor(root.right, childOne, childTwo);
		if (left == 1 & right == 1) {
			return root.data;
		}
		return Math.max(left, right);
	}

}
