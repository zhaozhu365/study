package study.zhaozhu.programmerinterview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
