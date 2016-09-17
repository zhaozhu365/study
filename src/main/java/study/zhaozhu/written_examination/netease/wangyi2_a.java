package study.zhaozhu.written_examination.netease;

import java.util.Scanner;

/**
 * 方法1：自己做的方法，时间复杂度并不高，但是耗时过长（开方运算耗时长）
 * 
 * @author Administrator
 * 
 */
public class wangyi2_a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			// long t1 = System.currentTimeMillis();
			System.out.println(getsum(n));
			// long t2 = System.currentTimeMillis();
			// System.out.println("total time=" + (t2 - t1));

			// System.out.println("sqrt time=" + sqrtTime);
		}
	}

	// static int sqrtTime = 0;

	static int f(int x) {
		if ((x & 1) == 1) {
			return x;
		}
		// long t1 = System.currentTimeMillis();
		// 经测试,开方运算过于耗时
		double sqrt = Math.sqrt(x);
		int k = (int) Math.floor(sqrt);
		int up = (int) Math.ceil(sqrt);
		// long t2 = System.currentTimeMillis();
		// long t3 = t2 - t1;
		// sqrtTime += t3;
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
