package study.zhaozhu.java.collection2;

import java.util.ArrayList;
import java.util.List;

public class TestSubList {
	public static void main(String[] args) {

		List<String> originalList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			originalList.add(String.valueOf(i));
		}
		
		List<String> sub1 = originalList.subList(0, 5);
		for (String s : sub1) {
			System.out.println(s);
		}
		System.out.println("=======================");
		for (int i=0;i<5;i++) {
			sub1.set(i, "new " + i);
		}
		for (String s : sub1) {
			System.out.println(s);
		}
		System.out.println("=======================");
		for (String s : originalList) {
			System.out.println(s);
		}
		System.out.println("=======================");
		
		List<String> sub2 = new ArrayList<>(sub1);
		sub2.addAll(originalList);
		for (String s : sub2) {
			System.out.println(s);
		}
		System.out.println("=======================");
		for (int i=0;i<5;i++) {
			sub2.set(i, "onather new " + i);
		}
		for (String s : sub2) {
			System.out.println(s);
		}
		System.out.println("=======================");
		for (String s : sub1) {
			System.out.println(s);
		}
		
	}
}
