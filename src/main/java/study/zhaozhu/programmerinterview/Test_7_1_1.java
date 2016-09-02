package study.zhaozhu.programmerinterview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * 把一个数组里的数的组合全部列出，比如数组{"1","2"}，列出来为1,2,12,21。(数组里没有重复)
 * <p>
 * 提示：考察递归
 * 
 * @ClassName: Test_7_1_1
 * @date 2016年9月2日 上午10:52:22
 *
 */
public class Test_7_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[] { "1", "2", "3", "4" };

		listAll(Arrays.asList(array), "");

	}

	public static void listAll(List candidate, String prefix) {
		System.out.println(prefix);

		for (int i = 0; i < candidate.size(); i++) {
			List temp = new LinkedList<>(candidate);
			listAll(temp, prefix + temp.remove(i));
		}

	}

}
