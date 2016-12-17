package com.aman.linkedlist;

import com.aman.linkedlist.LinkedList.Node;

public class DoublyLinkedList {

	Node head;
	
	public static class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int data) {
			this.data = data;
		}
		
		Node() {
		}
		
	}
	void printLinkedList() {
		Node temp = this.head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("#######");
	}
	
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	     Node prev;
	  }
	*/

	Node sortedInsert(int data) {
	    Node new_node = new Node();
	    new_node.data = data;
	    // CASE : HEAD is null
	    if(head == null) {
	        head = new_node;
	        head.next= null;
	        head.prev=null;
	        return head;
	    }
	    
	    //CASE: Only HEAD node is present
	    if(head.next == null) {
	        //CASE: head is larger, so new_node will be the new head of linked list
	        if(head.data > data) {
	            new_node.next = head;
	            new_node.prev = null;
	            head = new_node;
	            return head;
	        }
	        else {
	            head.next = new_node;
	            new_node.next = null;
	            new_node.prev = head;
	        }
	        
	    }
	    
	    // For other cases new_node will fit in middle or last
	    Node temp_fwd = head,
	    temp_bwd = null;
	    while(temp_fwd !=null && temp_fwd.data <= data) {
	        temp_fwd = temp_fwd.next;
	        if(temp_bwd == null){
	            temp_bwd = head;
	        }
	        else{
	            temp_bwd = temp_bwd.next;
	        }
	        
	    }
	    
	    if(temp_fwd == null) {
	        temp_bwd.next = new_node;
	        new_node.next = null;
	        new_node.prev = temp_bwd;
	    }
	    
	    else {
	        new_node.prev = temp_bwd;
	        new_node.next = temp_fwd;
	        temp_fwd.prev = new_node;
	        temp_bwd.next = new_node;
	    }
	    return head;
	  
	}
	
	
	public static void main(String args[]) {
		DoublyLinkedList linkList = new DoublyLinkedList();
		linkList.sortedInsert(2);
		linkList.sortedInsert(1);
		linkList.sortedInsert(4);
		linkList.sortedInsert(7);
		linkList.printLinkedList();
		
		
		/*linkList.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		linkList.head.next = second;
		second.next = third;
		//linkList.push(40);
		//linkList.addNodeAtEnd(50);
		linkList.printLinkedList();
		//linkList.addNodeAtPosition(21, 80);
		linkList.printLinkedList();*/
		
	}
}


