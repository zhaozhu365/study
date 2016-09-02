/**   
* @Title: TestReturn.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月12日 上午10:26:01 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.return_;

/**
 * @ClassName: TestReturn
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年6月12日 上午10:26:01
 * 
 */
public class TestReturn {
	public static void main(String[] args) {
		long t1 = System.nanoTime();
		// long t1 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			// test1();
			test2();
		}
		long t2 = System.nanoTime();
		// long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
	}

	static void test1() {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		int e = 1;
		if (a == 1) {
			if (b == 1) {
				if (c == 1) {
					if (d == 1) {
						if (e == 1) {
							return;
						}
					}
				}
			}
		}
	}

	static void test2() {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		int e = 1;
		if (a != 1) {
			return;
		}
		if (b != 1) {
			return;
		}
		if (c != 1) {
			return;
		}
		if (d != 1) {
			return;
		}
		if (e == 1) {
			return;
		}
	}

}
