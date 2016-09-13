/**   
* @Title: UnsortedBinarySearch.java 
* @author zhaozhu
* @date 2016年9月13日 下午5:26:34 
* @version V1.0   
*/
package study.zhaozhu.algorithm.search;

/**
 * @ClassName: UnsortedBinarySearch
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月13日 下午5:26:34
 * 
 */
public class UnsortedBinarySearch4 {

	static int[] e = new int[] { 1, 4, 9, 3, 24, 21, 6, 9, 9, 7, 6, 5, 3 };

	public static void main(String[] args) {
		int n = e.length, k = 4, i;
		int l = 0, h = n - 1, m, tl, th;
		while (l <= h) {
			m = e[l];
			tl = l;
			th = h;
			while (tl < th) {
				while (tl < th && e[th] > m)
					th--;
				e[tl] = e[th];
				while (tl < th && e[tl] < m)
					tl++;
				e[th] = e[tl];
			}
			e[tl] = m;
			if (m == k) {
				System.out.println(m);
				System.out.println(tl);
				return;
			}
			if (m > k)
				h = tl - 1;
			else
				l = tl + 1;
		}
	}

}
