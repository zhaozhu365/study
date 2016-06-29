package study.zhaozhu.design_pattern.singleton;

public class Singleton4 {

	private static volatile Singleton4 singleton = null;

	private Singleton4() {
	}

	public static Singleton4 getSingleton() {
		System.out.println("Singleton4:缓加载单例-双重检查锁====线程安全-效率较高-------------不推荐");
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}

		return singleton;
	}

}
