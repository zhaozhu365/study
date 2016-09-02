/**   
* @Title: BubbleSort.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年8月25日 下午5:58:12 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.algorithm.sort;

/**
 * @ClassName: BubbleSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年8月25日 下午5:58:12
 * 
 */
public class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35,
				25, 53, 51 };

		originBubbleSort(a);

		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	/**
	 * 原生冒泡
	 * 
	 * @return
	 */
	public static void originBubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

}
