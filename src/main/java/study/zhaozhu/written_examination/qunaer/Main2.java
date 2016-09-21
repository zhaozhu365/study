/**   
* @Title: Main2.java 
* @author zhaozhu
* @date 2016年9月20日 上午9:41:03 
* @version V1.0   
*/
package study.zhaozhu.written_examination.qunaer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @ClassName: Main2
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月20日 上午9:41:03
 * 
 */
public class Main2 {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 2, 4, 5, 2, 7, 2, 9, 2, 2 };

		System.out.println(getId(a));
	}

	public static int getId(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		int len = a.length;
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) != null) {
				int tp = map.get(a[i]) + 1;
				if (tp > len - tp) {
					return a[i];
				}
				map.put(a[i], tp);
			} else {
				map.put(a[i], 1);
			}
		}
		return -1;
//		int id = -1;
//		int count = -1;
//		for (Entry<Integer, Integer> entry : map.entrySet()) {
//			if (entry.getValue() > count) {
//				id = entry.getKey();
//				count = entry.getValue();
//			}
//		}
//		if (count > a.length - count) {
//			return id;
//		}
//
//		return -1;
	}

}
