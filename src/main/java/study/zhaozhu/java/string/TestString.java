/**   
* @Title: TestString.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月2日 下午7:23:20 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.string;

/** 
* @ClassName: TestString 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhaozhu
* @date 2016年6月2日 下午7:23:20 
*  
*/
public class TestString {
	
	public static void main(String[] args) {
		
		String str = new String("aaaa");
		
		//String content = "我是小萝卜";
		String content = "我叫我叫小萝卜";
		
		if (content.contains("我是")) {
			System.out.println(content.lastIndexOf("我是"));
			String name = content.substring(2 + content.lastIndexOf("我是"), content.length());
			System.out.println(name);
		}
		if (content.contains("我叫")) {
			System.out.println(content.lastIndexOf("我叫"));
			String name =  content.substring(2 + content.lastIndexOf("我叫"), content.length());
			System.out.println(name);
		}
		
	}
	
}
