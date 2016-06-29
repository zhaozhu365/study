package study.zhaozhu.java.T;

public class GenericsDemo08 {

	public static void main(String[] args) {
		Demo d = new Demo();
		String str = d.fun("汤姆");
		int i = d.fun(30);

		System.out.println(str);
		System.out.println(i);

	}

}

class Demo {
	public <T> T fun(T t) {// 可以接收任意类型的数据
		return t;
	}
}