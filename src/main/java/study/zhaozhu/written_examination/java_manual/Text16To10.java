/**   
* @Title: Text16To10.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年8月25日 下午4:05:13 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.written_examination.java_manual;

/**
 * @ClassName: Text16To10
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年8月25日 下午4:05:13
 * 
 */
public class Text16To10 {

	public static void main(String[] args) {
		test();
	}

	static void test() {
		System.out.println("------------10进制数转------------");
		int number1 = 14;//14
		System.out.println(Integer.toHexString(number1));//10>16
		System.out.println(Integer.toOctalString(number1));//10>8
		System.out.println(Integer.toBinaryString(number1));//10>2
		
		System.out.println("------------16进制数转------------");
		String number2 = "13abf";//80575
		System.out.println(Integer.valueOf(number2, 16));//16>10
		System.out.println(Integer.toOctalString(Integer.valueOf(number2, 16)));//16>8
		System.out.println(Integer.toBinaryString(Integer.valueOf(number2, 16)));//16>2
		
		System.out.println("------------8进制数转------------");
		String number3 = "77";//63
		System.out.println(Integer.valueOf(number3, 8));//8>10
		System.out.println(Integer.toHexString(Integer.valueOf(number3, 8)));//8>16
		System.out.println(Integer.toBinaryString(Integer.valueOf(number3, 8)));//8>2

		System.out.println("------------2进制数转------------");
		String number4 = "0101";//5
		System.out.println(Integer.valueOf(number4, 2));//2>10
		System.out.println(Integer.toHexString(Integer.valueOf(number4, 2)));//2>16
		System.out.println(Integer.toOctalString(Integer.valueOf(number4, 2)));//2>8
		
	}

	// 将一个16进制数转成10进制
	static void text16To10() {
		// 方法1
		String str = "13abf";
		int len = str.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			char c = str.charAt(len - 1 - i);
			int n = Character.digit(c, 16);
			sum += n * (1 << (4 * i));
		}
		System.out.println(sum);

		// 方法2
		System.out.println(Integer.parseInt(str, 16));
	}

}
