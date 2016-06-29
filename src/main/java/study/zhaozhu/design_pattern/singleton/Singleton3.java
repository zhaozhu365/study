package study.zhaozhu.design_pattern.singleton;

public class Singleton3 {

	private static volatile Singleton3 singleton = null;

	private Singleton3() {
	}

	public static Singleton3 getSingleton() {
		System.out.println("Singleton3:缓加载单例-单重检查锁====线程安全-效率低-------------极不推荐");
		synchronized (Singleton3.class) {
			if (singleton == null) {
				singleton = new Singleton3();
			}
		}

		return singleton;
	}

}
