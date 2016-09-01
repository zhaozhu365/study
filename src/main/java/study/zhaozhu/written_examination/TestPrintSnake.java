package study.zhaozhu.written_examination;

import java.util.Scanner;

public class TestPrintSnake {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt(); // 首先输入矩阵的维数
		int n = 5;
		int a[][] = new int[n][n]; // 存储所有元素的二维数组
		int count = 1; // 计数器，每走一步加一

		// 把二维数组从外到内一层一层剥开，按照上、右、下、左的顺序走
		// 注意临界值条件,尤其是拐角别重叠覆盖

		for (int i = 0; i < n / 2 + 1; i++) {
			// up
			for (int j = i; j < n - i; j++) {
				a[i][j] = count++;
			}
			// right
			for (int j = i + 1; j < n - i; j++) {
				a[j][n - i - 1] = count++;
			}
			// down
			for (int j = n - i - 2; j >= i; j--) {
				a[n - i - 1][j] = count++;
			}
			// left
			for (int j = n - i - 2; j > i; j--) {
				a[j][i] = count++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
				if (j == n - 1)
					System.out.println();
			}
		}
	}

}
