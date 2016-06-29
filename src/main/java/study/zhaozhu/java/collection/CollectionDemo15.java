package study.zhaozhu.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class CollectionDemo15 {

	public static <T> void printQueue(Queue<T> queue) {
		while (queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(rand.nextInt(i + 10));
		}
		printQueue(priorityQueue);

		List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<>(ints);
		printQueue(priorityQueue);
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
		printQueue(stringPQ);
		stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		printQueue(stringPQ);
		
		Set<Character> charSet = new HashSet<>();
		for (char c : fact.toCharArray()) {
			charSet.add(c);
		}
		PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
		printQueue(characterPQ);
		
		
		
	}

}
