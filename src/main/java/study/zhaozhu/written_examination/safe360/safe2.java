package study.zhaozhu.written_examination.safe360;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */
public class safe2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String cols = scan.nextLine();
			String first = scan.nextLine();
			String second = scan.nextLine();
			boolean forward = false, back = false, both = false;
			int len = second.length();
			int index = cols.indexOf(first);
			if (cols.subSequence(0, index + len + 1).toString()
					.contains(second))
				back = true;

			if (cols.subSequence(index + 1, cols.length()).toString()
					.contains(second)) {
				forward = true;
			if (forward && back)
					both = true;

			System.out.println(print(forward, back, both));

			}
		}
	}

	public static String print(boolean forward, boolean back, boolean both) {
		if (both) {
			return "both";
		} else if (forward) {
			return "forward";
		} else if (back) {
			return "backward";
		}
		return "invalid";
	}
}
