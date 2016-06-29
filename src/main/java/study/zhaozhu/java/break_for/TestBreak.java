package study.zhaozhu.java.break_for;

public class TestBreak {
	public static void main(String[] args) {
		
		//break 只跳出最内层循环
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 5; j++) {
				if (j > 2) {
					System.out.println("i=" + i + " j=" + j);
					break;
				}
			}
		}
		
	}
}
