package study.zhaozhu.java.bit;

/**
 * 测试移位、&、|、^操作
 * <p>
 * Java的位运算符详解实例——与（&）、非（~）、或（|）、异或（^）
 * <p>
 * 参考网站：
 * http://blog.csdn.net/vebasan/article/details/6193916
 * 
 * @author Administrator
 * 
 */
public class TestMoveBit {
	public static void main(String[] args) {
		testAnd();
		testOr();
		testXor();
	}
	
	/**
	 * 这个与运算可以判断一个二进制串的最后一个数是否是1，解释见上面的网址
	 */
	static void testAnd() {
		int n = 100;
		System.out.println(n & 1);
		n = n >> 1;
		System.out.println(n & 1);
		n = n >> 1;
		System.out.println(n & 1);
	}

	static void testOr() {
		int n = 100;
		System.out.println(n | 0);
		n = n >> 1;
		System.out.println(n | 0);
		n = n >> 1;
		System.out.println(n | 0);
	}

	static void testXor() {
		int n = 100;
		System.out.println(n ^ 1);
		n = n >> 1;
		System.out.println(n ^ 1);
		n = n >> 1;
		System.out.println(n ^ 1);
	}

}
