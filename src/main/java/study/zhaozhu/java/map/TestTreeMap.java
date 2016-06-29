package study.zhaozhu.java.map;

import java.util.HashMap;
import java.util.Map;

public class TestTreeMap {
	public static void main(String[] args) {
		
		Map<Integer, String> tree = new HashMap<>();
		tree.put(1, "a");
		tree.put(2, "b");
		tree.put(3, "c");
		tree.put(4, "d");
		tree.put(5, "e");
		tree.put(6, "f");
		tree.put(7, "g");
		
		for (Map.Entry<Integer, String> entry : tree.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}
}
