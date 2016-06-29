package study.zhaozhu.java.collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection2Demo2 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(1, 2, 3, 4, 5));
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		List<Integer> list4 = new ArrayList<>();
		Collections.addAll(list4, 1,2,3,4);
		
		// java.lang.UnsupportedOperationException
		list1.add(6);
		
		// ok
		list2.add(6);
		list3.add(6);
		list4.add(6);
		
	}

}
