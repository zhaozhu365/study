/**   
* @Title: TestSplit3.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月27日 上午11:22:59 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.string;

/**
 * @ClassName: TestSplit3
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年6月27日 上午11:22:59
 * 
 */
public class TestSplit3 {
	public static void main(String[] args) {

		String str = "MSG:CAgQGUocChYKCAgAEAUYASAACggIARAFGAEgABAAEAAgAQ==@";

		try {
			System.out.println(str.split("MSG:")[1]);
			System.out.println(str.split("MSG:")[1].split("==@")[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
