package com.brigelabz;

public class Queue
{
	Node front;
	Node rear;

	int length;

	class Node
	{
		int data;
		Node next;
		public Node(int data) 
		{

			this.data = data;
			this.next = null;
		}

	}
	public void enQueue(int data)
	{
		if (front == null) 
		{
			rear = new Node(data);
			front = rear;
		}
		else
		{
			rear.next = new Node(data);
			rear = rear.next;
		}

		length ++;

	}
	public void print()
	{
		Node temp = front;
		while(temp != null)
		{
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
	}
		public void deQueue()
		{
			if (front != null)
			{
				int temp = front.data;
				front = front.next;
				length--;
				return;
			}

	}
}
