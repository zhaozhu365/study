/**   
* @Title: TestStringCharAt.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年8月25日 下午2:45:52 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.string;

/**
 * @ClassName: TestStringCharAt
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年8月25日 下午2:45:52
 * 
 */
public class TestStringCharAt {
	/**
	 * 输入一个整数，求这个整数中每位数字的相加和
	 * @param args
	 */
	public static void main(String[] args) {
		// 方法1
		String num = "84729";
		System.out.println(num.charAt(0));
		System.out.println(String.valueOf(num.charAt(0)));
		System.out.println(Integer.parseInt(String.valueOf(num.charAt(0))));

		// 方法2
		String num1 = "84729";
		int length = num1.length();
		int num_at_0 = Integer.parseInt(num1) / ((int) Math.pow(10, length - 1));
		System.out.println(num_at_0);
	}
}
