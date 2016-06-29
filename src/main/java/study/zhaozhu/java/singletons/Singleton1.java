package study.zhaozhu.java.singletons;

public class Singleton1 {

	private static Singleton1 singleton = new Singleton1();

	private Singleton1() {
	}

	public static Singleton1 getSingleton() {
		System.out.println("Singleton1:急加载单例--------------极不推荐");
		return singleton;
	}

}
