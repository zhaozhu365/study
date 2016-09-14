/**   
* @Title: ZidianxvQuanpailie.java 
* @author zhaozhu
* @date 2016年9月14日 上午10:11:35 
* @version V1.0   
*/
package study.zhaozhu.written_examination.lianhe30;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @ClassName: ZidianxvQuanpailie
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月14日 上午10:11:35
 * 
 */
public class ZidianxvQuanpailie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 3, 4 };
		func(a);

	}
	
	/**
	 * 根据题目要求，先将数组由小到大排序。然后输出第1个，
	 * 输出第1个后，第1个从数组中删除。并将第1个缓存下来，输出第2个时，
	 * 要和这个缓存下来的数进行比较，如果满足条件，才进行输出，否则判断出下一个。递归即可。
	 * @param arr
	 */
	/**
	 * 这个题还是有问题,比如，如果原数组为，2 3 3，这样就出问题了。得不到正确得结果。
	 * 这个方案可以优化，优化之后的思路：原数组还在，只不过第一次输出罪小的。如果这个不行的话，则重新来，下次先输出第2小的。
	 * @param arr
	 */
	static void func(int[] arr) {
		LinkedList<Integer> list = new LinkedList<>();
		Arrays.sort(arr);
		for (int i : arr) {
			list.add(i);
		}
		int temp = list.get(0);
		list.remove(0);
		System.out.print(temp + " ");
		while (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) - temp == 1) {

				} else {
					System.out.print(list.get(i) + " ");
					temp = list.get(i);
					list.remove(i);
					break;
				}
			}
		}

	}

}
