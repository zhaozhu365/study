package study.zhaozhu.java.collection;

import java.util.Iterator;

public class CollectionDemo16 {

	public static void main(String[] args) {

		for (String s : new IterableTest()) {
			System.out.print(s + " ");
		}
	}

}

class IterableTest implements Iterable<String> {

	protected String[] words = "This paper designs a circuit based on hysteresis comparator and filter which is used to transfer frequency signal."
			.split(" ");

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {

			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			@Override
			public String next() {
				return words[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}

		};
	}

}