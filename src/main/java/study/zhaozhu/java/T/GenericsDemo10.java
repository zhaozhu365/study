package study.zhaozhu.java.T;

public class GenericsDemo10 {

	public static void main(String[] args) {

		Integer i[] = fun1(1, 2, 3, 4, 5, 6);
		fun2(i);

	}

	public static <T> T[] fun1(T... arg) {
		return arg;
	}

	public static <T> void fun2(T param[]) {
		System.out.print("接收泛型数组：");

		for (T t : param) {
			System.out.print(t + "、");
		}

	}

}
