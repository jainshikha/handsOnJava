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
 * 				 \
 * 				 11
 * 
 * Find distance between nodes
 * Input: 10 & 8
 * Output: 6
 */
public class DistanceBtwNodes {
	private static boolean isCompleted = false;

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
		bt.root.left.left.right.right = new Node(11);

		int ancestor = findDistance(bt.root, 11, 5);
		System.out.println("Output: " + ancestor);
	}

	private static int findDistance(Node root, int childOne, int childTwo) {
		if (root == null || isCompleted) {
			return 0;
		}
		if (root.data == childOne || root.data == childTwo) {
			return 1;
		}
		int left = findDistance(root.left, childOne, childTwo);
		int right = findDistance(root.right, childOne, childTwo);
		if (left > 0 && right > 0) {
			isCompleted = true;
			System.out.println("left : "+ left);
			System.out.println("right : "+ right);
			return left + right;
		}
		if (left == 0 && right == 0) {
			return 0;
		}
		if(isCompleted) {
			return Math.max(left, right);
		}
		return Math.max(left, right) + 1;
	}

}
