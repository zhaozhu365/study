/**   
* @Title: TestSort.java 
* @Description: TODO
* @author zhaozhu
* @date 2016年8月26日 上午10:44:13 
* @version V1.0   
*/
package study.zhaozhu.algorithm.sort;

/** 
* @ClassName: TestSort 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhaozhu
* @date 2016年8月26日 上午10:44:13 
*  
*/
public class TestSort {
	public static void main(String[] args) {
		
	}
	
	static int AdjustArray(int[] s, int l, int r){
		int i = l, j = r;
		int x = s[l];
		while (i < j) {
			while (i < j && s[j] >= x) {
				j--;
			}
			if (i < j) {
				s[i] = s[j];
				i++;
			}
			
			while (i < j && s[i] <= x) {
				i++;
			}
			if (i < j) {
				s[j] = s[i];
				j--;
			}
		}
		
		s[i] = x;
		return i;
	}
	
	static void quickSort(int[] s, int l, int r){
		if (l < r) {
			int i = AdjustArray(s, l, r);
			quickSort(s, l, i - 1);
			quickSort(s, i + 1, r);
		}
	}
	
}
