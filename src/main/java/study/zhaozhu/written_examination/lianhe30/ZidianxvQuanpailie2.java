/**   
* @Title: ZidianxvQuanpailie.java 
* @author zhaozhu
* @date 2016年9月14日 上午10:11:35 
* @version V1.0   
*/
package study.zhaozhu.written_examination.lianhe30;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName: ZidianxvQuanpailie
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月14日 上午10:11:35
 * 
 */
public class ZidianxvQuanpailie2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String ss = "12334";
		// System.out.println(Permutation(ss).toString());

		Permutation2(new int[] { 1, 2, 3, 3, 4 });
	}

	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> res = new ArrayList<String>();
		if (str == null || str.length() == 0) {
			return res;
		}
		// 将字符串转成字节数组，方便排序
		char[] a = str.toCharArray();
		// 按字母表中的位置排序，如果忽略此步，会导致找到的全排列有所丢失。即给定字符串是bac，如果不重新排列成abc，那么abc-bac之间的字典序字符串会丢失
		Arrays.sort(a);
		while (true) {
			res.add(String.valueOf(a));
			int i = 0;
			// 从右向左，寻找第一个比右邻小的元素，找到停止，负责一致扫描完整个数组
			for (i = a.length - 2; i >= 0 && a[i] >= a[i + 1]; i--)
				;
			int j = i;

			// 如果j==-1，也就是上面的for循环没找到符合的元素，说明现在的数组从左向右是递减的，即最后一个字典序，返回整个集合
			if (j == -1) {
				return res;
			}

			// 找到符合的元素j后，反向扫描，寻找比j元素大的中最小的一个。其实整个地方比较简单，我们在第一次for循环时，找到j，说明从n到j，即数组从右向左一直到j，是递增的，否则不会找到j。所以我们只需要从数组最右端先左扫描即可找到第一个比j大的，即使符合要求的。
			for (i = a.length - 1; i > 0 && a[i] <= a[j]; i--)
				;
			int k = i;

			// 找到j和k元素后，交换两个元素，
			char b = a[j];
			a[j] = a[k];
			a[k] = b;

			// 上面的工作我们只是找到了j位置的元素，j+1到n位置的元素还是一个递增的，不符合字典序，下面是逆序的过程
			for (int l = j + 1; l < (a.length + j) / 2 + 1; l++) {
				char c = a[l];
				a[l] = a[a.length - l + j];
				a[a.length - l + j] = c;
			}

			// 全部处理完，找到所需要的字典序，在找到的字典序数组基础上，再去找下一个字典序
		}
	}

	public static void Permutation2(int[] a) {
		// 按字母表中的位置排序，如果忽略此步，会导致找到的全排列有所丢失。即给定字符串是bac，如果不重新排列成abc，那么abc-bac之间的字典序字符串会丢失
		Arrays.sort(a);
		while (true) {

			for (int i = 0; i < a.length - 1; i++) {
				if (a[i + 1] == a[i] + 1) {
					break;
				}
				if (i == a.length - 2) {
					for (int i2 = 0; i2 < a.length; i2++) {
						System.out.print(a[i2] + " ");
					}
					return;
				}
			}

			// TODO
			int i = 0;
			// 从右向左，寻找第一个比右邻小的元素，找到停止，负责一致扫描完整个数组
			for (i = a.length - 2; i >= 0 && a[i] >= a[i + 1]; i--)
				;
			int j = i;

			// 如果j==-1，也就是上面的for循环没找到符合的元素，说明现在的数组从左向右是递减的，即最后一个字典序，返回整个集合
			if (j == -1) {
				return;
			}

			// 找到符合的元素j后，反向扫描，寻找比j元素大的中最小的一个。其实整个地方比较简单，我们在第一次for循环时，找到j，说明从n到j，即数组从右向左一直到j，是递增的，否则不会找到j。所以我们只需要从数组最右端先左扫描即可找到第一个比j大的，即使符合要求的。
			for (i = a.length - 1; i > 0 && a[i] <= a[j]; i--)
				;
			int k = i;

			// 找到j和k元素后，交换两个元素，
			int b = a[j];
			a[j] = a[k];
			a[k] = b;

			// 上面的工作我们只是找到了j位置的元素，j+1到n位置的元素还是一个递增的，不符合字典序，下面是逆序的过程
			for (int l = j + 1; l < (a.length + j) / 2 + 1; l++) {
				int c = a[l];
				a[l] = a[a.length - l + j];
				a[a.length - l + j] = c;
			}

		}
	}
	public static void Permutation3(int[] a) {
		Arrays.sort(a);
		while (true) {
			
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i + 1] == a[i] + 1) {
					break;
				}
				if (i == a.length - 2) {
					for (int i2 = 0; i2 < a.length; i2++) {
						System.out.print(a[i2] + " ");
					}
					return;
				}
			}
			
			int i = 0;
			for (i = a.length - 2; i >= 0 && a[i] >= a[i + 1]; i--)
				;
			int j = i;
			
			if (j == -1) {
				return;
			}
			
			for (i = a.length - 1; i > 0 && a[i] <= a[j]; i--)
				;
			int k = i;
			
			int b = a[j];
			a[j] = a[k];
			a[k] = b;
			
			for (int l = j + 1; l < (a.length + j) / 2 + 1; l++) {
				int c = a[l];
				a[l] = a[a.length - l + j];
				a[a.length - l + j] = c;
			}
			
		}
	}

}
