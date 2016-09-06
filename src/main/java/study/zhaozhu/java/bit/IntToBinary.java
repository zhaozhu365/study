package study.zhaozhu.java.bit;

/**
 * 将一个10进制数转成2进制
 * <p>
 * 实现方式1：移位，然后与操作
 * <p>
 * 实现方式2： 参考Integer.toBinary的实现
 * 
 * @author Administrator
 * 
 */
public class IntToBinary {
	public static void main(String[] args) {
		int n = 100, m = 100;
		// 这样是倒着输出
		// 如果要正着输出,则将数保存在一个数组中,倒叙输出即可
		while (n != 0) {
			System.out.println(n & 1);
			n >>= 1;
		}

		// Integer.toBinary的实现
		System.out.println(Integer.toBinaryString(m));

	}
}
