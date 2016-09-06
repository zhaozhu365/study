/**   
* @Title: QuickSort.java 
* @Description: TODO
* @author zhaozhu
* @date 2016年8月25日 下午6:04:16 
* @version V1.0   
*/
package study.zhaozhu.algorithm.sort;

/**
 * @ClassName: QuickSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年8月25日 下午6:04:16
 * 
 */
public class QuickSort {
	public static void main(String[] args) {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35,
				25, 53, 51 };

		originQuickSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	/**
	 * 时间复杂度:O(N*logN);最好O(N);最差O(N*N)
	 * 
	 * @param s
	 * @param l
	 * @param r
	 */
	public static void originQuickSort(int[] s, int l, int r) {
		if (l < r) {
			int i = AdjustArray(s, l, r);// 先用挖坑填数法调整s[] | 一趟排序
			originQuickSort(s, l, i - 1);// 递归调用,对一趟排序后的左边进行排序
			originQuickSort(s, i + 1, r);// 递归调用,对一趟排序后的右边进行排序
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
