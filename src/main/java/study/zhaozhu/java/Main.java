package study.zhaozhu.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String s = scan.nextLine();
			int n = Integer.parseInt(s);
			
			System.out.println(result(n));
		}
		

	}

	static int result(int n) {
		int result = 0;
		result = 1 + (n * (n - 1)) / 2 + (n * (n - 1) * (n - 2) * (n - 3)) / 24 - n;
		return result;
	}
	
}


