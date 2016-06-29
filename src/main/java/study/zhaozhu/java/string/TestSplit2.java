package study.zhaozhu.java.string;

public class TestSplit2 {

	public static void main(String[] args) {

		String str1 = "command,,topic_music,";
		// String str2 = "command,topic_music,,";

		/**
		 * <pre>
		 * 注意，如果是 str2 的情况,则ss的长度为2 
		 * 如果是 str1的情况,则ss的长度为3,并且ss[1]是空串""
		 * </pre>
		 */

		String[] ss = str1.split(",");

		System.out.println(ss.length);
		for (String s : ss) {
			System.out.println(s);
			if ("".equals(s)) {
				System.out.println("s=空串");
			}

		}

	}

}
