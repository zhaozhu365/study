package study.zhaozhu.written_examination.netease;

import java.util.Scanner;

/**
 * 方法2：动态规划方法
 * 
 * @author Administrator
 * 
 */
public class wangyi2_b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(getsum(n));
		}
	}

	static int getsum(int n) {
		if (n == 1) {
			return 1;
		}
		if (n % 2 == 0) {
			return getsum(n / 2) + n * n / 4;
		} else {
			return getsum(n - 1) + n;
		}
	}
}
