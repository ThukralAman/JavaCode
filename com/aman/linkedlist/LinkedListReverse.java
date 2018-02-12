package com.aman.linkedlist;

public class LinkedListReverse {
	
	public LinkedList.Node reverseLinkedList(LinkedList.Node node) {
		LinkedList.Node prev = null;
		
		while(node!=null) {
			LinkedList.Node temp = node.next;
			node.next = prev;
			prev = node;
			node = temp;
		}
		return prev;
	}

	public static void main(String[] args) {
		LinkedListReverse obj = new LinkedListReverse();
		
		LinkedList ll = new LinkedList();
		ll.head = new LinkedList.Node(10);
		ll.head.next = new LinkedList.Node(20);
		ll.head.next.next = new LinkedList.Node(30);
		ll.head.next.next.next = new LinkedList.Node(40);
		ll.head.next.next.next.next = new LinkedList.Node(50);
		
		ll.printLinkedList();
		LinkedList.Node head = obj.reverseLinkedList(ll.head);
		ll.head = head;
		ll.printLinkedList();
		
		
	}
}
