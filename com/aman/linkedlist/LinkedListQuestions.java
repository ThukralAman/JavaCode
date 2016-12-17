package com.aman.linkedlist;

public class LinkedListQuestions {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.push(30);
		ll.push(20);
		ll.push(10);
		ll.push(0);
		ll.printLinkedList();
		int nth=5;
		System.out.println(nth + " node from last is " + ll.printNthFromLast(nth));
	}
}
