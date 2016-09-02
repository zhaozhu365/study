/**   
* @Title: TestNewString.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年8月26日 上午9:53:03 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.string;

/** 
* @ClassName: TestNewString 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhaozhu
* @date 2016年8月26日 上午9:53:03 
*  
*/
public class TestNewString {
	//关于值传递
	public static void main(String[] args) {
		String x = new String("ab");  
		changeStr(x);
		System.out.println(x);
		
		int int1 = 1;
		changeInt(int1);
		System.out.println(int1);
		
		Integer int2 = 1;
		changeInteger(int2);
		System.out.println(int2);
		
		Integer int3 = new Integer(1);
		changeInteger(int3);
		System.out.println(int3);
		
		
	}
	
	public static void changeStr(String str){
		//str = "cd";
		str = new String("cd");
	}
	
	public static void changeInt(int str){
		str = 2;
	}
	public static void changeInteger(Integer str){
		//str = 3;
		str = new Integer(3);
	}
	
}
