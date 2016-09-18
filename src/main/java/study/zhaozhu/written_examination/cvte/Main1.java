package study.zhaozhu.written_examination.cvte;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * cvte 2016秋招笔试
 * @author Administrator
 *
 */
public class Main1 {
	public static void main(String[] args) {
		Main1 c = new Main1();
		int[] array = { 1, 2, 2 };
		c.subsets(array);
	}

	/**
	 * 第二题:用二进制的思想
	 * 
	 * @param array
	 */
	public void subsets(int[] array) {
		int k = 0;
		int n = array.length;
		int max = (int) Math.pow(2, n);
		List<String> list = new ArrayList<>();
		while (k < max) {
			String str = getArray(array, k);
			k++;
			if (!list.contains(str)) {
				list.add(str);
			}
		}
		for (String str : list) {
			System.out.println("[" + str + "]");
		}
	}

	public String getArray(int[] array, int indexs) {
		StringBuffer sf = new StringBuffer();
		int index = 0;
		if (indexs == 0) {
			return "";
		}
		while (indexs > 0) {
			if ((indexs & 1) == 1) {
				sf.append(array[index] + ",");
			}
			indexs = indexs >> 1;
			index++;
		}
		sf.deleteCharAt(sf.length() - 1);

		return sf.toString();
	}

	/**
	 * 第一题:栈的应用
	 * 
	 * @param str
	 * @return
	 */
	public static boolean fun(String str) {
		boolean flag = false;
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (s.isEmpty()) {
				if (str.charAt(i) == '(' || str.charAt(i) == '{') {
					s.push(str.charAt(i));
				} else if (str.charAt(i) == ')' || str.charAt(i) == '}') {
					break;
				}
			} else {
				if (str.charAt(i) == '(' || str.charAt(i) == '{') {
					s.push(str.charAt(i));
				} else if (str.charAt(i) == ')' || str.charAt(i) == '}') {
					char c = s.pop();
					if ((c == '(' && str.charAt(i) != ')') || c == '{'
							&& str.charAt(i) != '}') {
						break;
					}
				}
			}
		}
		if (s.isEmpty()) {
			flag = true;
		}
		return flag;

	}
}
