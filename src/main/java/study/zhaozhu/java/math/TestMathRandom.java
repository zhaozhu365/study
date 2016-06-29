package study.zhaozhu.java.math;

public class TestMathRandom {
	public static void main(String[] args) {
		int i = 1000;
		while (i-- > 0) {
			System.out.println(Math.round(Math.random() * 100));
		}
		
	}
}
