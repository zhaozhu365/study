package study.zhaozhu.java.clazz;

public class TestProtectClass {
	//内部类可以被protect,private,public修饰
	protected class A{}
	private class B{}
	public class C{}
	
}
//外部类不能用private, protected修饰,
private class D{}
protected class E{}

//一个类文件中，只能有一个public修饰的外部类
public class F{}