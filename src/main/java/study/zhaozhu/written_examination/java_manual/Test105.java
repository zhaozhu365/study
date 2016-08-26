/**   
* @Title: Test105.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年8月25日 下午5:05:38 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.written_examination.java_manual;

/**
 * @ClassName: Test105
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年8月25日 下午5:05:38
 * 
 */
public class Test105 {
	/**
	 * 输入两个正整数m和n，输出其最大公约数和最小公倍数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int m = 5;
		int n = 9;

		System.out.println(maxCommonDivisorByDigui(m, n));
		System.out.println(maxCommonDivisor(m, n));
		System.out.println(minCommonMultiple(m, n));
	}

	// 递归法求最大公约数
	static int maxCommonDivisorByDigui(int m, int n) {
		if (m < n) {// 保证m>n,若m<n,则进行数据交换
			int temp = m;
			m = n;
			n = temp;
		}

		if (m % n == 0) {
			return n;
		} else {
			// 在余数不能为0时,进行递归
			return maxCommonDivisorByDigui(n, m % n);
		}
	}

	// 辗转相除法求最大公约数
	static int maxCommonDivisor(int m, int n) {
		if (m < n) {// 保证m>n,若m<n,则进行数据交换
			int temp = m;
			m = n;
			n = temp;
		}

		while (m % n != 0) {// 在余数不能为0时,进行循环
			int temp = m % n;
			m = n;
			n = temp;
		}

		return n;// 返回最大公约数
	}

	// 求最小公倍数 = m * n / maxCommonDivisor(m, n)
	static int minCommonMultiple(int m, int n) {
		return m * n / maxCommonDivisor(m, n);
	}

}
