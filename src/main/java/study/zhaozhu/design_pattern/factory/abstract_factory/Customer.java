package study.zhaozhu.design_pattern.factory.abstract_factory;

public class Customer {

	public static void main(String[] args) {
		
		FactoryA a = new FactoryA();
		a.createWasher();
		a.createIcebox();
		
		FactoryB b = new FactoryB();
		b.createWasher();
		b.createIcebox();
	}

}
