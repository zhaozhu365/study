package study.zhaozhu.written_examination.netease;

import java.util.Scanner;

public class wangyi1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(getNums(n));
			//System.out.println(getSum(n));
		}
	}

	public static int getSum(int n) {
		int sum = -1;
		int a = 0;
		int b = 0;
		int m = n / 8;
		for (int i = m; i >= 0; i--) {
			if ((n - 8 * i) % 6 == 0) {
				b = (n - 8 * i) / 6;
				a = i;
				sum = a + b;
				break;
			}
		}
		return sum;
	}
	
	public static int getNums(int n) {
		int sum = -1;
		int x = 0;
		int y = 0;
		int m = n / 6;
		for (int i = 0; i <= m; i++) {
			if ((n - 6 * i) % 8 == 0) {
				y = (n - 6 * i) / 8;
				x = i;
				sum = x + y;
				break;
			}
		}

		return sum;
	}
}
