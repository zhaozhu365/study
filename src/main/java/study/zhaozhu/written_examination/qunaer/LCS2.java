/**   
* @Title: LCS.java 
* @author zhaozhu
* @date 2016年9月20日 上午9:15:26 
* @version V1.0   
*/
package study.zhaozhu.written_examination.qunaer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LCS
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月20日 上午9:15:26
 * 
 */
public class LCS2 {

	public static void getLCString(char[] str1, char[] str2) {
		int i, j;
		int len1, len2;
		len1 = str1.length;
		len2 = str2.length;
		int maxLen = len1 > len2 ? len1 : len2;
		int[] max = new int[maxLen];
		int[] maxIndex = new int[maxLen];
		int[] c = new int[maxLen];

		for (i = 0; i < len2; i++) {
			for (j = len1 - 1; j >= 0; j--) {
				if (str2[i] == str1[j]) {
					if ((i == 0) || (j == 0))
						c[j] = 1;
					else
						c[j] = c[j - 1] + 1;
				} else {
					c[j] = 0;
				}

				if (c[j] > max[0]) {
					max[0] = c[j];
					maxIndex[0] = j;

					for (int k = 1; k < maxLen; k++) {
						max[k] = 0;
						maxIndex[k] = 0;
					}
				} else if (c[j] == max[0]) {
					for (int k = 1; k < maxLen; k++) {
						if (max[k] == 0) {
							max[k] = c[j];
							maxIndex[k] = j;
							break;
						}

					}
				}
			}
		}
		
		//TODO 如果只需要输出最后一个，在这里优化
		//优化方式有2种，第一种1:将所有的lcs记录到一个数组中，然后输出最后一个
		//第二种，先将字符串反序，然后记录第一个后，break，然后将记录的这个反序输出
		List<String> temp = new ArrayList<>();
		for (j = 0; j < maxLen; j++) {
			if (max[j] > 0) {
				StringBuffer sb = new StringBuffer();
				//System.out.print("result=");
				for (i = maxIndex[j] - max[j] + 1; i <= maxIndex[j]; i++){
					//System.out.print(str1[i]);
					sb.append(str1[i]);
				}
				temp.add(sb.toString());
			}
		}
		System.out.print("result=");
		System.out.print(temp.get(temp.size() - 1));
		
	}

	public static void main(String[] args) {
		String str1 = new String("afhelk");
		String str2 = new String("afdzhelos");
		getLCString(str1.toCharArray(), str2.toCharArray());
	}

}
