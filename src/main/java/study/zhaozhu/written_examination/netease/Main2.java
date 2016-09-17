package study.zhaozhu.written_examination.netease;

import java.util.Scanner;

/**
 * 网易2016校招笔试：将字符串2插入到字符串1中,并判断新字符串有多少是回文串
 * stringbuilder 的insert和reverse方法
 * @author Administrator
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str1 = scan.next();
			StringBuilder sb = null;
			String str2 = scan.next();
			int count = 0;
			for (int i = 0; i < str1.length() + 1; i++) {
				sb = new StringBuilder(str1);
				String temp = sb.insert(i, str2).toString();
				if (isHuiwen(temp)) {
					count++;
				}
				sb = null;
			}
			System.out.println(count);
		}

	}

	public static boolean isHuiwen(String input) {
		if (input != null) {
			StringBuilder sb = new StringBuilder(input);
			sb.reverse();
			String inputReverse = sb.toString();
			if (input.equals(inputReverse)) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
//	public static boolean isHuiwen(String input) {
//		if (input != null) {
//			StringBuilder sb = new StringBuilder(input);
//			sb.reverse();
//			String inputReverse = sb.toString();
////			for (int i = 0; i < input.length(); i++) {
////				if (input.charAt(i) != inputReverse.charAt(i)) {
////					return false;
////				}
////			}
//			if (input.equals(inputReverse)) {
//				return true;
//			}else {
//				return false;
//			}
//		} else {
//			return false;
//		}
//	}
//	public static boolean isHuiwen(String input) {
//		if (input != null) {
//			int length = input.length();
//			for (int i = 0; i < length / 2; i++) {
//				if (input.charAt(i) != input.charAt(length - i - 1)) {
//					return false;
//				}
//			}
//			return true;
//		} else {
//			return false;
//		}
//	}

}
