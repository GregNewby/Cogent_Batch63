package com.cogent.problem;


public class ReverseLinkedList {
	
	public static class ListNode {

	    private int data;
	    private ListNode next;

	    ListNode(int data) {
	        this.data = data;
	        this.next = null;
	    }
	    ListNode(int data, ListNode next) {
	        this.data = data;
	        this.next = next;
	    }
		public void setNext(ListNode next) {
			this.next = next;
		}
		@Override
		public String toString() {
			return "[" + data + "]->" + next + "]";
		}
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
				
		
		System.out.println(list);
		System.out.println(reverseLinkedList(list));
		
	}
	
	public static ListNode reverseLinkedList(ListNode list) {
		ListNode prev = null;
		ListNode curr = list;
		ListNode next = null;
		
		while(curr != null){
			next = curr.next;	
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
}
