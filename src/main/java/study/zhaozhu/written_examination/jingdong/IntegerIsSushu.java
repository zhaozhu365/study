package study.zhaozhu.written_examination.jingdong;

/**
 * 
 * 京东2016秋招笔试题目3:
 * <p>
 * 考察位运算、移位操作、移位循环终止条件
 * <p>
 * 素数:一个10进制数的各个位数的和与该数二进制各个位之和相等的话称为素数
 * <p>
 * 判断一个数是不是素数，最大是10000
 * 
 * 
 * @author Administrator
 * 
 */
public class IntegerIsSushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = n;
		int sum1 = 0, sum2 = 0;
		while (m != 0) {
			sum2 += m & 1;
			m >>= 1;
		}
		System.out.println(sum2);
		
		
		
	}

	final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
			99999999, 999999999, Integer.MAX_VALUE };

	static int sizeOfInt(int x) {
		for (int i = 0;; i++)
			if (x <= sizeTable[i])
				return i + 1;
	}

}
