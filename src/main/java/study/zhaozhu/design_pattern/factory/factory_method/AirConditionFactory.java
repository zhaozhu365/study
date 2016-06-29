package study.zhaozhu.design_pattern.factory.factory_method;

public class AirConditionFactory implements Factory {

	@Override
	public Product create() {
		return new AirCondition();
	}

}
