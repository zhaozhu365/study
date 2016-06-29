package study.zhaozhu.design_pattern.factory.factory_method;

public class IceboxFactory implements Factory {

	@Override
	public Product create() {
		return new Icebox();
	}

}
