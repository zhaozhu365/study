package study.zhaozhu.java.enums;

public enum AdvancedWeek implements IWeek {

	MONDAY("星期一", "Mon."), 
	TUESDAY("星期二", "Tues."), 
	WEDNESDAY("星期三", "Wed."), 
	THURSDAY("星期四", "Thurs."), 
	FRIDAY("星期五", "Fri."), 
	SATURDAY("星期六", "Sat."), 
	SUNDAY("星期日", "Sun.");

	private String nameCn;
	private String abbreviation;

	// 构造方法只能为private
	private AdvancedWeek() {
	}

	private AdvancedWeek(String nameCn, String abbreviation) {
		this.setNameCn(nameCn);
		this.setAbbreviation(abbreviation);
	}

	public String getNameCn() {
		return nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Override
	public void println() {
		System.out.println(this.ordinal() + " - " + this.name() + " - " + this.getAbbreviation() + " - " + this.getNameCn());
	}
	
}
