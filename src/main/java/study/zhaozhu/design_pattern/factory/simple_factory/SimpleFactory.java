package study.zhaozhu.design_pattern.factory.simple_factory;

/**
 * 简单工厂模式
 * 
 * @author zhaozhu
 *
 */
public class SimpleFactory {
	public static Product factory(String productName) throws Exception {
		switch (productName) {
		case "Washer":

			return new Washer();
		case "Icebox":

			return new Icebox();
		case "AirCondition":

			return new AirCondition();

		default:
			throw new Exception("没有该产品");
		}
	}

}
