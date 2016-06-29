package study.zhaozhu.design_pattern.factory.abstract_factory;

public class FactoryA implements Factory {

	@Override
	public Washer createWasher() {
		return new WasherA();
	}

	@Override
	public Icebox createIcebox() {
		return new IcoboxA();
	}

}
