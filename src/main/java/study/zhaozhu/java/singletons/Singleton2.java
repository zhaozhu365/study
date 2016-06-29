package study.zhaozhu.java.singletons;

public class Singleton2 {

	private static Singleton2 singleton = null;

	private Singleton2() {
	}

	public static Singleton2 getSingleton() {
		System.out.println("Singleton2:缓加载单例-仅适用单线程-------------不推荐");
		if (singleton == null) {
			singleton = new Singleton2();
		}

		return singleton;
	}

}
