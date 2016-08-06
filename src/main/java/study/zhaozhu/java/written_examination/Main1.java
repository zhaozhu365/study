package study.zhaozhu.java.written_examination;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */
public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] xs = new int[n];
			int[] ys = new int[n];
			for (int i = 0; i < n; i++) {
				xs[i] = scan.nextInt();
			}
			for (int i = 0; i < n; i++) {
				ys[i] = scan.nextInt();
			}

			int min = 0;

			for (int i = 0; i < n; i++) {
				int temp1 = xs[i] - 1;
				int temp2 = ys[i] - 1;
				int temp = temp1 + temp2;

				if (i == 0) {
					min = temp;
				} else {
					if (temp < min) {
						min = temp;
					}
				}
			}
			System.out.println(min);
		}

	}

}
