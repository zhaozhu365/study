package study.zhaozhu.design_pattern.factory.simple_factory;

public class Customer {

	public static void main(String[] args) {
		try {
			SimpleFactory.factory("Washer");
			SimpleFactory.factory("Icebox");
			SimpleFactory.factory("AirCondition");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
