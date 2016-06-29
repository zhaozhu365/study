package study.zhaozhu.java.random;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		
		Random ran = new Random(50);
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
	}
}
