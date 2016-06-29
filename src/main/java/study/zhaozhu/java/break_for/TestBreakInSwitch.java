/**   
* @Title: TestBreakInSwitch.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月14日 上午9:58:33 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.break_for;

/**
 * @ClassName: TestBreakInSwitch
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年6月14日 上午9:58:33
 * 
 */
public class TestBreakInSwitch {
	public static void main(String[] args) {
		int[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int i = 4;

		switch (i) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;

		case 4:
			switch (i) {
			case 1:

				break;
			case 4:

				break;

			default:
				break;
			}
			//break;
		case 5:
			System.out.println("-------");
			break;
		default:
			break;
		}

	}
}
