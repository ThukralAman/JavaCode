package com.aman.linkedlist;

public class LinkedList {

	Node head=null;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
		
	}
	void printLinkedList() {
		Node temp = this.head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("#######");
	}
	
	void addNodeFront(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	void addNodeAtEnd(int data) {
		Node node = new Node(data);
		node.next = null;
		Node temp=head;
		while(temp.next!= null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	void addNodeAtPosition(int position, int data) {
		Node node = new Node(data);
		Node temp = head;
		boolean listEnd = false;
		if(position==1) {
			node.next = head;
			head = node;
			return;
		}
		
		int nodeIndex = 1;
		/* - keep incrementing temp till pos-2. At (pos-2) iteration it moves temp to pos-1
		*/
		while(nodeIndex <= (position-2)) { 
			if(temp.next == null) {
				listEnd = true;
				break;
			}
			else{
				temp = temp.next;
			}
			nodeIndex++;
		}
		if(listEnd) {
			System.out.println("Sorry list length is short, adding your data at last pos: " + (nodeIndex + 1) );
		}
		node.next = temp.next;
		temp.next = node;
	}
	
	
	
	
	
	public static void main(String args[]) {
		LinkedList linkList = new LinkedList();
		linkList.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		linkList.head.next = second;
		second.next = third;
		linkList.addNodeFront(40);
		linkList.addNodeAtEnd(50);
		linkList.printLinkedList();
		linkList.addNodeAtPosition(21, 80);
		linkList.printLinkedList();
		
	}
}
