package study.zhaozhu.design_pattern.factory.factory_method;

public class Icebox implements Product {

	@Override
	public void build(String name) {
		System.out.println(name + "被制造了");

	}

	public Icebox() {
		build("冰箱");
	}

}
