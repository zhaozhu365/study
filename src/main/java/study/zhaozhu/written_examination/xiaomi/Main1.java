package study.zhaozhu.written_examination.xiaomi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n <= 0) {
			System.out.println(0);
			return;
		}
		if (n == 1) {
			System.out.println(1);
			return;
		}
		if (n == 2) {
			System.out.println(2);
			return;
		}
		int height = 2;
		Set<Integer> parent = new HashSet<>();
		parent.add(0);
		Set<Integer> son = new HashSet<>();
		int a = 0;
		int b = 0;
		for (int i = 0; i < n - 1;i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			if (parent.contains(a)) {
				son.add(b);
			}else {
				parent = new HashSet<>(son);
				son.clear();
				son.add(b);
				height++;
			}
		}
		System.out.println(height);
	}
	
}
