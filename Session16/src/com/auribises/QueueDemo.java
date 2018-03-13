package com.auribises;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			pq.add(i);
		}
		
		/*System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());*/
		
		/*System.out.println(pq.size());
		System.out.println("--------");
		for(int i=1;i<=10;i++){
			//System.out.println(pq.peek());
			System.out.println(pq.poll());
		}
		System.out.println("--------");
		System.out.println(pq.size());*/
		
		for(int i=0;i<pq.size();i++){
			System.out.println(pq.poll());
		}
		
	}

}
