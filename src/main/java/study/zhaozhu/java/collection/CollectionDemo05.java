package study.zhaozhu.java.collection;

import java.util.Iterator;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionDemo05 {

	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while (it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		for (Pet p : pets) {
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		it = pets.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}

}
