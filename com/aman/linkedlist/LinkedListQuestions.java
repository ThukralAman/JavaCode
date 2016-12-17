package com.aman.linkedlist;

import com.aman.linkedlist.LinkedList.Node;

public class LinkedListQuestions {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		/* 
		 * PRINT Nth NODE FROM END*/
		
        /*
        ll.push(30);
		ll.push(20);
		ll.push(10);
		ll.push(0);
		ll.printLinkedList();
		int nth=5;
		System.out.println(nth + " node from last is " + ll.printNthFromLast(nth));
		*/
		ll.head = new Node(10);
		ll.head.next = new Node(20);
		ll.head.next.next = new Node(30);
		ll.head.next.next.next = new Node(40);
		ll.head.next.next.next.next = new Node(50);
		ll.head.next.next.next.next.next = ll.head.next.next;
		Boolean isLoopPresent = ll.detectLoopInLinkedList();
	}
}
