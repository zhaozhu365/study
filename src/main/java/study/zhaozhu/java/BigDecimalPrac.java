package study.zhaozhu.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalPrac {
	
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		String s1 = scanner1.nextLine();
		String s2 = scanner2.nextLine();
		
		System.out.println(result(s1, s2));
		
	}
	
	static BigDecimal result(String s1, String s2) {
		BigDecimal d1 = new BigDecimal(s1);
		BigDecimal d2 = new BigDecimal(s2);
		return d1.subtract(d2);
	}
	
}
