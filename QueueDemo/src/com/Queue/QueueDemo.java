package com.Queue;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		//adding data to queue
		for(int x = 10; x > 0; x--) {
			queue.add(x);
			
			// Queue (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
			// PriorityQueue sorts the data for us
			
			// Queue (Front) 1 2 3 4 5 6 7 8 9 10 (Rear) | sorted Queue the Actual one
			
			// two method
			// Peeking -> Obtaining the head of Queue
			// Polling -> Remove the head of Queue
			
		}
		System.out.println(queue.peek()); // Head of Queue :1
		
		queue.poll(); //Removing the head
		
		System.out.println(queue.peek()); // Head of Queue :1
	}

}
