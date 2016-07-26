/**   
* @Title: SortByLength.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年7月26日 下午6:19:09 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName: SortByLength
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年7月26日 下午6:19:09
 * 
 */
public class SortByLength {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<>();
		ls.add("abc");
		ls.add("d");
		ls.add("efgh");
		ls.add("ijk");
		ls.add("mnopq");

		MyCompartor mc = new MyCompartor();
		
		for(String s : ls) {
			System.out.print(s);
			System.out.print(" ");
		}
		
		System.out.println();
		
		Collections.sort(ls, mc); // 升序 22，23
		for(String s : ls) {
			System.out.print(s);
			System.out.print(" ");
		}
		
		System.out.println();
		
		Collections.reverse(ls); // 降序 23,22
		for(String s : ls) {
			System.out.print(s);
			System.out.print(" ");
		}
	}
	
	/**
	 * 升序
	* @ClassName: MyCompartor 
	* @Description: TODO(这里用一句话描述这个类的作用) 
	* @author zhaozhu@luobotec.com
	* @date 2016年7月26日 下午6:46:35 
	*
	 */
	static class MyCompartor implements Comparator<Object> {
		@Override
		public int compare(Object o1, Object o2) {
			Integer sdto1 = ((String) o1).length();
			Integer sdto2 = ((String) o2).length();
			return sdto1.compareTo(sdto2);
		}
	}
	
//	/**
//	 * 降序
//	* @ClassName: MyCompartor 
//	* @Description: TODO(这里用一句话描述这个类的作用) 
//	* @author zhaozhu@luobotec.com
//	* @date 2016年7月26日 下午6:46:19 
//	*
//	 */
//	static class MyCompartor implements Comparator<String> {
//		@Override
//		public int compare(String o1, String o2) {
//			Integer sdto1 = o1.length();
//			Integer sdto2 = o2.length();
//			return sdto2.compareTo(sdto1);
//		}
//	}

}
