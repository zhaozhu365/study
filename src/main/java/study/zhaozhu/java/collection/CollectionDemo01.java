package study.zhaozhu.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo01 {

	public static void main(String[] args) {

		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		Integer[] moreInts = { 6, 7, 8, 9, 10 };

		collection.addAll(Arrays.asList(moreInts));

		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);

		List<Integer> list1 = Arrays.asList(16, 17, 18, 19, 20);

		List<Integer> list2 = Arrays.asList(moreInts);
		
		
		
	}

}
