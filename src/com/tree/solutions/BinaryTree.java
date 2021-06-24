package com.tree.solutions;

public class BinaryTree {

	Node root;
	
	static class Node {
		int data;
		Node left, right = null;
		
		public Node(int d) {
			this.data = d;
		}
		
		public boolean isLeafNode() {
			return this.left == null ? this.right == null : false;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
		
	}
}
