package com.deckofcard;

public class LinkedList {
	public Node head;
	
	private class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			next = null;
		}
	}
	
	/**
	 * To add the data into the linked list
	 * @param data
	 */
	public void add(final String data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;

		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	/**
	 * This method orints the content of linked list
	 */
	public void print() {
		Node temp = head;
		if (temp == null) {
			System.out.println("Underflow, Linked list is empty");
			return;
		}
		while (temp.next != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
