/**   
* @Title: ClassTest.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年7月27日 下午5:41:28 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.clazz;

/** 
* @ClassName: ClassTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhaozhu@luobotec.com
* @date 2016年7月27日 下午5:41:28 
*  
*/
public class ClassTest {
	
	static{
		System.out.println("load ClassTest");
	}
	
	public static void main(String[] args) {
		
		try {
			Class.forName(ClassTest.class.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
