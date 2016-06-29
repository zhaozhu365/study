package study.zhaozhu.design_pattern.singleton;

public class Singleton5 {

	private static class Holder {
		private static Singleton5 singleton = new Singleton5();
	}

	private Singleton5() {
	}

	public static Singleton5 getSingleton() {
		System.out.println("Singleton5:缓加载单例-静态内部类====线程安全-高效-------------推荐");
		
		return Holder.singleton;
	}

}
