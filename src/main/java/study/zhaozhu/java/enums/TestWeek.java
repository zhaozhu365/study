package study.zhaozhu.java.enums;

public class TestWeek {
	public static void main(String[] args) {

		Week[] days = Week.values();
		for (Week day : days) {
			String name = day.name();
			int ordinal = day.ordinal();
			String dayToString = day.toString();
			Class declaringClass = day.getDeclaringClass();
			Class superClass = declaringClass.getSuperclass();

			System.out.println("Name:" + name);
			System.out.println("Ordinal:" + ordinal);
			System.out.println("dayToString:" + dayToString);
			System.out.println("declaringClass:" + declaringClass);
			System.out.println("superClass:" + superClass);
			System.out.println("========================");

		}

	}
}
