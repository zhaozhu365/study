package study.zhaozhu.java.math;

public class TestMathRandom {
	public static void main(String[] args) {
		
		int i = 1000;
		while (i-- > 0) {
			// 随机：0-99
//			System.out.println(Math.round(Math.random() * 100));
			
			// 随机出现：0-2
			int index = (int) Math.floor((Math.random() * 3));
			System.out.println(index);
		}
		
	}
}
