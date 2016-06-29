package study.zhaozhu.java.collection;

import java.util.LinkedList;

public class CollectionDemo09 {

	public static void main(String[] args) {
		MyStack<String> myStack = new MyStack<String>();
		for (String s : "My dog has fleas".split(" ")) {
			myStack.push(s);
		}
		while (!myStack.empty()) {
			System.out.print(myStack.pop() + " ");
		}
	}

}

// MyStack已经声明为范型类
class MyStack<T> {
	private LinkedList<T> storage = new LinkedList<T>();

	public void push(T v) {
		storage.addFirst(v);
	}

	public T peek() {
		return storage.getFirst();
	}

	public T pop() {
		return storage.removeFirst();
	}

	public boolean empty() {
		return storage.isEmpty();
	}

	public String toString() {
		return storage.toString();
	}

}
