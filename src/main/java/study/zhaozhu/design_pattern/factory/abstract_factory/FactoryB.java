package study.zhaozhu.design_pattern.factory.abstract_factory;

public class FactoryB implements Factory {

	@Override
	public Washer createWasher() {
		return new WasherB();
	}

	@Override
	public Icebox createIcebox() {
		return new IcoboxB();
	}

}
