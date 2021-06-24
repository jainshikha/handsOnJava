package com.linkedList.solutions;

/*
 * For a given list, reverse it.
 * 
 * Input: 
 * 9
 * 2 -> 18 -> 24 -> 3 -> 5 -> 7 -> 9 -> 6 -> 12
 * 
 * Output: 12 -> 6 -> 9 -> 7 -> 5 -> 3 -> 24 -> 18 -> 2
 */
public class ReverseList {

	public static void main(String[] args) {
		Node head = new Node(2);
		head.add(18).add(24).add(3).add(5).add(7).add(9).add(6).add(12);
		System.out.println("Input list: ");
		head.print();
		
		head = reverse(head);
		System.out.println("Output list: ");
		head.print();
	}

	private static Node reverse(Node head) {
		Node prev = head;
		Node temp = null;
		Node current = head.next;
		while (current != null) {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		head.next = null;
		return prev;
	}

}
