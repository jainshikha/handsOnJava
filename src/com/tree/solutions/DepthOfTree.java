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
 * Count depth of a tree.
 * Output: 4
 */
public class DepthOfTree {

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
        bt.root.right.left.right.left = new Node(8);

        int count = depth(bt.root);
        System.out.println("Output: " + count);
    }

    private static int depth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.isLeafNode()) {
            return 1;
        }

        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

}
