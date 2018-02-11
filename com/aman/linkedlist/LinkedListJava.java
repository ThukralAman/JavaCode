package com.aman.linkedlist;

import java.util.LinkedList;
/*
 * 
 *  - add(element): Appends the specified element to the end of this list. 
 *  - add(index, element): Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
 *  - addFirst(element): Inserts the specified element at the beginning of this list.
 *  - remove(): Retrieves and removes the head (first element) of this list.
 *  - remove(index): Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices). Returns the element that was removed from the list.
 *  - removeFirst()
 *  - removeLast()
 */

public class LinkedListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(1, 20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.addFirst(1);
		System.out.println(linkedList);
		
		System.out.println("remove()");
		linkedList.remove();
		System.out.println(linkedList);
		
		System.out.println("remove(1)");
		linkedList.remove(1);
		System.out.println(linkedList);
		
		System.out.println("removeFirst()");
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		System.out.println("removeLast()");
		linkedList.removeLast();
		System.out.println(linkedList);
	}

}
