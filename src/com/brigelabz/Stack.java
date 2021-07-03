package com.brigelabz;

public class Stack
{
	Node top;
	int size;

	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			super();
			this.data = data;
			this.next = null;
		}

	}
	
	public void push(int data)
	{		
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;

		size++;


	}
	
    public void print()
    {		
		Node temp = top;
		while(temp != null) 
		{
			System.out.print(temp.data +  "-> ");
			temp = temp.next;
		}
		
    }
}
