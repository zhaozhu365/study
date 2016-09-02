/**   
* @Title: Test1.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月21日 下午8:02:52 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName: Test1
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年6月21日 下午8:02:52
 * 
 */
public class Test1 {
	public static void main(String[] args) {

		String input2 = "hellonowcoder";

		int n = 4;

		Set<Integer> mSet = new TreeSet<>();
		mSet.add(0);
		mSet.add(1);
		mSet.add(1);
		mSet.add(4);
		mSet.add(2);
		mSet.add(5);
		mSet.add(2);
		mSet.add(3);

		char[] cs = input2.toCharArray();

		TreeSet<Integer> ts = new TreeSet<>();

		List<Integer> list1 = new ArrayList<>();

		List<Integer> list2 = new ArrayList<>();

		int[] a1 = new int[mSet.size()];
		int[] a = new int[mSet.size()];

		for (int i : mSet) {
			ts.add((int) cs[i]);
			list1.add(i);
			list2.add((int) cs[i]);
		}

		for (int i = 0; i < list1.size(); i++) {
			a1[i] = list1.get(i);
		}

		for (int i = 0; i < list2.size(); i++) {
			a[i] = list2.get(i);
		}

		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int i : a) {
			System.out.print((char) i + " ");
		}

		System.out.println();

		for (int i = 0; i < a1.length; i++) {
			cs[a1[i]] = (char) a[i];
		}

		System.out.println(String.valueOf(cs));
	}

}
