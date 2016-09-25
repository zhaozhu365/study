package study.zhaozhu.written_examination.yixin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 宜信2016秋招：
 * 
 * @author Administrator
 * 
 */
public class Main2 {

	public static void main(String[] args)

	{
		System.out.println(isUglyNum(14));
		
		int input = 10;
		// 已知，小于6全部都是丑陋的
		if (input <= 6) {
			System.out.println(1);
		} else {
			
		}

	}

	public static int isUglyNum(int num) {
		int res = 1;
		if (num <= 6) {
			return 1;
		}
		int n = 13860;
		Set<Integer> set = new HashSet<>();
		set.add(2);
		set.add(3);
		set.add(5);
		for (int i = 2; i <= n / 2; i++) {
			// 先判断是不是因子
			if (n % i != 0) {
				continue;
			}
			// 再判断是不是质因子
			if (!isPrime(i)) {
				continue;
			}

			if (!set.contains(i)) {
				res = 0;
				break;
			}
		}
		return res;
	}

	public static boolean isPrime(int n) {
		int i;
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				break;
			}
		}

		if (i >= n) {
			return true;
		}

		else {
			return false;
		}
	}

}
