package study.zhaozhu.java.singletons;

public enum Singleton6 {

	INSTANCE;

	private Singleton6EG singleton6eg = new Singleton6EG();

	public Singleton6EG getSingleton6EG() {
		System.out.println("Singleton6:缓加载单例-枚举类====线程安全-高效-------------推荐");

		return singleton6eg;
	}

}

class Singleton6EG {

}