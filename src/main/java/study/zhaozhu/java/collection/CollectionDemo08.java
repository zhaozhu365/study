package study.zhaozhu.java.collection;

import java.util.List;
import java.util.ListIterator;

import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionDemo08 {

	public static void main(String[] args) {

		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
		}
		System.out.println();
		while (it.hasPrevious()) {
			System.out.print(it.previous().id() + ", ");
		}
		System.out.println();
		System.out.println(pets);
		it = pets.listIterator(3);
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		it = pets.listIterator(3);
		while (it.hasNext()) {
			it.next();
			
			// 注意,这个it是指向List的,当it做出改变后,原List也会做相应改变
			it.set(new Mouse());
		}	
		System.out.println();
		System.out.println(pets);
	}

}
