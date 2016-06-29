package study.zhaozhu.java.collection;

import java.util.HashMap;
import java.util.Map;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

public class CollectionDemo12 {

	public static void main(String[] args) {
	
		Map<String, Pet> petMap = new HashMap<>();
		petMap.put("cat", new Cat("Molly"));
		petMap.put("dog", new Dog("Ginger"));
		petMap.put("hamster", new Hamster("Bosco"));
		System.out.println(petMap);
		
		Pet dog = petMap.get("dog");
		System.out.println(dog);
		System.out.println(petMap.containsKey("dog"));
		System.out.println(petMap.containsValue(dog));
		
	}

}

