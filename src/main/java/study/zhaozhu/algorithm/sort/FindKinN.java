/**   
* @Title: FindKinN.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年8月25日 下午7:53:51 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.algorithm.sort;

/**
 * @ClassName: FindKinN
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年8月25日 下午7:53:51
 * 
 */
public class FindKinN {
	// 从一组数据中寻找第K大的数
	public static void main(String[] args) {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35,
				25, 53, 51 };
		
		System.out.println(a.length);
		
		int k = 3;
		
		// k只能写1-24,有空找找原因;1的时候表示第2小值
		findK(a, 0, a.length - 1, 1);

	}

	/**
	 * 时间复杂度:最好O(N);最差O(N*logN)
	 * 
	 * @param s
	 * @param l
	 * @param r
	 * @param k
	 */
	public static void findK(int s[], int l, int r, int k) {
		if (l < r) {
			int i = AdjustArray(s, l, r);
			if (i == k) {
				System.out.println(s[i]);
				return;
			}
			if (i < k) {
				findK(s, i + 1, r, k);
			}
			if (i > k) {
				findK(s, l, i - 1, k);
			}
		}else {
			System.out.println(l + " " + r + " " + k);
		}
	}

	/**
	 * //一趟排序过程,返回基准值最终的位置: x即为基准值,i为基准值最终的位置
	 * 
	 * @param s
	 *            数组
	 * @param l
	 *            需要排序的左边界
	 * @param r
	 *            需要排序的右边界
	 * @return
	 */
	public static int AdjustArray(int s[], int l, int r) {
		int i = l, j = r;
		int x = s[l]; // s[l]即s[i]就是第一个坑
		while (i < j) {
			// 从右向左找小于x的数来填s[i]
			while (i < j && s[j] >= x) {
				j--;
			}
			if (i < j) {
				s[i] = s[j]; // 将s[j]填到s[i]中，s[j]就形成了一个新的坑
				i++;
			}

			// 从左向右找大于x的数来填s[j]
			while (i < j && s[i] <= x) {
				i++;
			}
			if (i < j) {
				s[j] = s[i];// 将s[i]填到s[j]中，s[i]就形成了一个新的坑
				j--;
			}
		}

		// 退出时，i等于j。将x填到这个坑中。
		s[i] = x;

		return i;
	}
}
