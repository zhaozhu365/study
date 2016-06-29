package study.zhaozhu.design_pattern.factory.factory_method;

public class Customer {

	public static void main(String[] args) {

		new AirConditionFactory().create();
		new IceboxFactory().create();
		new WasherFactory().create();

	}

}
