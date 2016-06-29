package study.zhaozhu.java.string;

public class TestSplit {
	
	
	
	public static void main(String[] args) {
		String str1 = "音乐";
		String str2 = "上一首/music";
		
		String[] strs1 = str1.split("/");
		String[] strs2 = str2.split("/");
		
		System.out.println(strs1.length);
		System.out.println(strs2.length);
		
		// 从输出可以看出,split的用法：结果都是返回一个数组,如果有"/",则数组长度>1;
		//如果没有,则数组长度=1, strs1[0].equals(str1)==true
		
//		char[] chars = str1.toCharArray();
//		StringBuffer buffer = new StringBuffer();
//		for (char c : chars) {
//			if (c != ','){
//				buffer.append(c);
//			}else {
//				break;
//			}
//		}
	}
	
}
