package study.zhaozhu.java.collection2;

import java.util.LinkedList;
import java.util.List;

public class TestListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arr = new LinkedList<>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		
		//System.out.println(arr.toString() + ""+ arr.remove(0));
		//System.out.println(""+ arr.remove(0) + "" + arr.toString());
		testListRemove(arr, arr.remove(0));
	}
	
	static void testListRemove(List arr, String str) {
		System.out.println(arr.toString() + arr.remove(1));
	}

}
