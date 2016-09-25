package study.zhaozhu.written_examination.yixin;

import java.util.HashSet;
import java.util.Set;

/**
 * 宜信2016秋招：
 * 
 * @author Administrator
 * 
 */
public class Main3 {

	public static void main(String[] args) {
		String str = "abcdcdef";
		int n = 2;

		if (str == null || n <= 0) {
			return;
		}
		getMax(str, n);
	}

	public static void getMax(String str, int n) {
		int start = 0;
		int end = str.length() - 1;
		int max = 0;
		Set<Character> subStr = new HashSet<>();

		int i = start;
		while (start <= end) {
			if (i <= end) {
				subStr.add(str.charAt(i));
				if (subStr.size() <= n) {
					if (max < i - start + 1) {
						max = i - start + 1;
					}
					i++;
				} else {
					start++;
					i = start;
					subStr.clear();
				}
			} else {
				break;
			}

		}
		System.out.println(max);
	}

}
