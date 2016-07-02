/**   
* @Title: TestQuChong.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年7月2日 下午4:34:23 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestQuChong
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年7月2日 下午4:34:23
 * 
 */
public class TestQuChong {

	private static final String TAG = TestQuChong.class.getName() + "      ";

	public static void main(String[] args) {

		String content = "啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊你你你我我我他他他";

		if (content.length() >= 10) {
			System.out.println(TAG + "content.length() = " + content.length());
			char[] chars = content.toCharArray();
			List<Character> list = new ArrayList<>();
			for (char c : chars) {
				if (!list.contains(c)) {
					list.add(c);
				}
			}
			System.out.println(TAG + list.toString());

			String temp = list.toString();
			temp = temp.replace("[", "");
			temp = temp.replace("]", "");
			temp = temp.replace(",", "");
			temp = temp.replace(" ", "");

			System.out.println(TAG + temp);

			if (list.size() >= 10) {
				System.out.println(TAG + "无效输入");
				return;
			}
			System.out.println(TAG + "有效输入");
		}

	}
}
