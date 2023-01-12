package com.linkedList.solutions;

import java.util.Scanner;
import java.util.Stack;

/*
 * For given list, reverse it when you find even nodes.
 * 
 * Input:
 * 9
 * 2 -> 18 -> 24 -> 3 -> 5 -> 7 -> 9 -> 6 -> 12
 * 
 * Output: 24 -> 18 -> 2 -> 3 -> 5 -> 7 -> 9 -> 12 -> 6
 */
public class ReverseEvenList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		Node head = reverse(size);
		System.out.println("Output list: ");
		head.print();
	}

	private static Node reverse(int size) {
		Scanner s = new Scanner(System.in);
		Node head = null;
		Node node = null;
		Node temp = null;
		Stack<Node> stack = new Stack<>();
		for(int i=0; i<size; i++) {
			node = new Node(s.nextInt());
			if (node.data % 2 == 0) {
				stack.push(node);
				continue;
			}
			while(!stack.isEmpty()) {
				if (head == null) {
					head = stack.pop();
					temp = head;
					continue;
				}
				Node nd = stack.pop();
				temp.next = nd;
				temp = nd;
			}
			temp.next = node;
			temp = node;
		}
		while(!stack.isEmpty()) {
			Node nd = stack.pop();
			temp.next = nd;
			temp = nd;
		}
		return head;
	}

}
