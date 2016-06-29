package study.zhaozhu.design_pattern.factory.factory_method;

public class WasherFactory implements Factory {

	@Override
	public Product create() {
		return new Washer();
	}

}
