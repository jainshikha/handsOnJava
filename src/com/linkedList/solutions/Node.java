package com.linkedList.solutions;

public class Node {

	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void print() {
		Node temp = this;
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public Node add(int data) {
		Node temp = this;
		temp.next = new Node(data);
		return temp.next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
