/**   
* @Title: TestBreakOk.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年8月25日 上午10:34:05 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.break_for;

/**
 * @ClassName: TestBreakLabel
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年8月25日 上午10:34:05
 * 
 */
public class TestBreakLabel {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			//break label的用法：java中实现break goto
			label1:for (int j = 0; j < 5; j++) {
				if (j > 2) {
					System.out.println("i=" + i + " j=" + j);
					break label1;
				}
			}
		}

	}
}
