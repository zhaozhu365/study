package study.zhaozhu.java.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo10 {

	public static void main(String[] args) {

		new SetOfInteger();
		new SortedSetOfInteger();

	}

}

class SetOfInteger {

	public SetOfInteger() {
		Random rand = new Random(47);
		Set<Integer> intSet = new HashSet<>();
		for (int i = 0; i < 10000; i++) {
			intSet.add(rand.nextInt(30));
		}
		System.out.println(intSet);
		System.out.println(intSet.size());
	}
}

class SortedSetOfInteger {

	public SortedSetOfInteger() {
		Random rand = new Random(47);
		Set<Integer> intSet = new TreeSet<>();
		for (int i = 0; i < 10000; i++) {
			intSet.add(rand.nextInt(30));
		}
		System.out.println(intSet);
		System.out.println(intSet.size());
	}
}



