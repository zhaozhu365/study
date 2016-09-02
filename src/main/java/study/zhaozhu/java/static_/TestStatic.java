/**   
* @Title: TestStatic.java 
* @Description: TODO
* @author zhaozhu
* @date 2016年9月2日 下午2:38:57 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.static_;

/**
 * <p>
 * 从一段几乎所有人代码都会犯错的代码:类加载时,static的初始化问题
 * <p>
 * 第一次测试的结果：1 0
 * <p>
 * 第二次测试的结果：1 1
 * 
 * @ClassName: TestStatic
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月2日 下午2:38:57
 * 
 */
public class TestStatic {

	// 第二次测试：2
	// public static int a;
	// public static int b = 0;

	public static TestStatic t = new TestStatic();

	public TestStatic() {
		a++;
		b++;
	}

	// 第一次测试：1
	public static int a;
	public static int b = 0;

	public static void main(String[] args) {
		System.out.println(t.a + " " + t.b);
	}

}
