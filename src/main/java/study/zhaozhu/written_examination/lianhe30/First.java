/**   
* @Title: First.java 
* @author zhaozhu
* @date 2016年9月14日 上午10:15:39 
* @version V1.0   
*/
package study.zhaozhu.written_examination.lianhe30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName: First
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月14日 上午10:15:39
 * 
 */
public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			String s = str.charAt(i) + "";
			count = 0;
			if (map.get(s) == null) {
				count = 1;
			} else {
				count = map.get(s);
			}

			map.put(s, count);
		}

		StringBuffer bf = new StringBuffer();
		for (String key : map.keySet()) {
			bf.append(map.get(key) + "" + key);
		}

		System.out.println(bf.toString());

	}

}
