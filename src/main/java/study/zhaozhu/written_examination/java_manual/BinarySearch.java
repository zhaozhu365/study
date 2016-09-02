/**   
* @Title: BinarySearch.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年8月25日 下午4:49:46 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.written_examination.java_manual;

/**
 * @ClassName: BinarySearch
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年8月25日 下午4:49:46
 * 
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

		System.out.println(binarySearch(arr, 6));
		System.out.println(binarySearch(arr, 5));

	}

	static boolean binarySearch(int[] arr, int value) {
		int low = 0;
		int height = arr.length - 1;
		int mid;
		while (low <= height) {
			mid = (low + height) / 2;
			if (arr[mid] == value) {
				System.out.println("在第" + mid + "位置找到" + value);
				return true;
			} else {
				if (arr[mid] > value) {
					height = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}

		System.out.println("没有找到" + value);
		return false;
	}

}
