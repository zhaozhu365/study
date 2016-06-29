package study.zhaozhu.java.T;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo11 {

	public static void main(String[] args) {

		List<MyType> list = queryType();
		for (MyType myType : list) {
			System.out.println(myType.getType());

		}
	}

	/**
	 * 	泛型方法不一定要通过参数来确定泛型准确类型，可以只通过返回值，比如：

		 public static <E> ArrayList<E> newArrayList() {
		    return new ArrayList<E>();
		  }

	    public List<PrepaidHistory> queryHistories(Long skyid,PrepaidHistoryType type, Date from, Date end) {
	
	　　　　。。。
	             return Lists.newArrayList();
	    }

		这样Lists.newArrayList();
		智能的知道返回类型为PrepaidHistory
	 * @param e
	 * @return
	 */
	public static <E> ArrayList<E> newArrayList(E e) {
		ArrayList<E> list = new ArrayList<E>();
		list.add(e);
		return list;
	}

	public static List<MyType> queryType() {
		MyType myType = new MyType();
		myType.setType("我的类型");
		return newArrayList(myType);
	}

	

}

class MyType {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MyType [type=" + type + "]";
	}

}