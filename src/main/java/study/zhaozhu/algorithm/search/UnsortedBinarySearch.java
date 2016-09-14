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

	// 无序数组的二分查找,并返回原始索引
	// 定义两个数组，index，和B，index里存放索引，B里存放数据
	// 每次找到一个最小的放到B里，同时把它的索引存在index中
	// 然后对B二分查找，找到处于B中索引后，根据这个去index中找原始索引

	static int[] a = new int[] { 1, 4, 9, 3, 24, 21, 6, 9, 9, 7, 6, 5, 3 };

	public static void main(String[] args) {

	}

}
