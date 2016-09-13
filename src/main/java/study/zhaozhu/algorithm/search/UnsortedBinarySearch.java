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
public class UnsortedBinarySearch {

	static int[] a = new int[] { 1, 4, 9, 3, 24, 21, 6, 9, 9, 7, 6, 5, 3 };

	public static void main(String[] args) {
		int n = a.length,k = 2;
		
		System.out.println(unsorted_binarysearch(1,n,k));
		
	}

	static int _sort(int left, int right) {
		int x = a[left];
		while (left < right) {
			while (a[right] > x && left < right)
				right--;
			if (left < right) {
				a[left] = a[right];
				left++;
			}
			while (a[left] < x && left < right)
				left++;
			if (left < right) {
				a[right] = a[left];
				right--;
			}
		}
		a[left] = x; // left==right
		return left;
	}

	static int unsorted_binarysearch(int left, int right, int key) // 每次都选择起点作为“枢纽”
	{
		if (left > right)
			return -1;

		int x = a[left];
		int mid_loc = _sort(left, right);

		if (x == key)
			return mid_loc;
		else if (x > key)
			return unsorted_binarysearch(left, mid_loc - 1, key);
		else
			return unsorted_binarysearch(mid_loc + 1, right, key);

	}

}
