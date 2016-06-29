package study.zhaozhu.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionDemo06 {
	
	static <T> void display(Iterator<T> it) {
		while (it.hasNext()) {
			T t = it.next();
			if (t instanceof Pet) {
				System.out.print(((Pet) t).id() + ":" + t + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Pet> pets = Pets.arrayList(8);
		LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS = new HashSet<>(pets);
		TreeSet<Pet> petsTS = new TreeSet<>(pets);

		display(pets.iterator());
		display(petsLL.iterator());
		display(petsHS.iterator());
		display(petsTS.iterator());
	}

}
