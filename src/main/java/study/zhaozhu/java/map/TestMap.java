package study.zhaozhu.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {
	
	// hashmap的key可以为null, hashmap线程不安全
	static Map<Object, Object> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		// ConcurrentHashMap的key不可以为null, ConcurrentHashMap线程安全
		map = new ConcurrentHashMap<>();
		
		map.put(null, "sdas");
		
		
		System.out.println(map.get(null));
	}
	
	
}
