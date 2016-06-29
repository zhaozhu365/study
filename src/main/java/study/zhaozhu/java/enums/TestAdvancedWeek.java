package study.zhaozhu.java.enums;

public class TestAdvancedWeek {
	public static void main(String[] args) {
		
		AdvancedWeek[] adays = AdvancedWeek.values();
		for (AdvancedWeek aday : adays) {
			aday.println();
		}
		
		
	}
}
