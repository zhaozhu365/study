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


	static int f(int x) {
		if ((x & 1) == 1) {
			return x;
		}
		double sqrt = Math.sqrt(x);
		int k = (int) Math.floor(sqrt);
		int up = (int) Math.ceil(sqrt);

		if ((k & 1) == 1) {
			return k;
		} else {
			if (k == up)
				return f(k);
			else {
				return f(x >> 1);
			}
		}
	}

	static int getsum(int n) {
		int m = 0;
		int maxj = 0;
		int t = 0;
		if ((n & 1) == 0) {
			m = n >> 1;
			maxj = n - 1;
			t = n;
		} else {
			m = n >> 1 + 1;
			maxj = n;
			t = n - 1;
		}
		int sum = (1 + maxj) * (m >> 2);
		for (int i = 2; i <= t; i = i + 2) {
			sum += f(i);

		}
		return sum;
	}

}
