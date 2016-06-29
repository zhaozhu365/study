package study.zhaozhu.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CollectionDemo14 {

	public static void printQueue(Queue queue){
		while(queue.peek() != null){
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue<Integer> qi = new LinkedList<>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			qi.offer(rand.nextInt(i + 10));
		}
		printQueue(qi);
		
		Queue<Character> qc = new LinkedList<>();
		for (char c : "Brontosaurus".toCharArray()) {
			qc.offer(c);
		}
		printQueue(qc);
		
	}

}

