package study.zhaozhu.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CollectionDemo11 {

	public static void main(String[] args) {
		new Statistics();
	}

}

class Statistics {
	public Statistics() {
		Random rand = new Random(47);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 100000000; i++) {
			int r = rand.nextInt(20);
			Integer freg = map.get(r);
			map.put(r, freg == null ? 1 : freg + 1);
		}
		System.out.println(map);
	}
}
