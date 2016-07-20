/**   
* @Title: ClassInterface.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年7月20日 下午8:32:36 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.clazz;

import java.lang.reflect.Constructor;

/**
 * @ClassName: ClassInterface
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年7月20日 下午8:32:36
 * 
 */
public class ClassInterface {

	public static void main(String[] args) {
		/** 公用部分 */
		Class<?> demo = null;
		try {
			demo = Class.forName(Person1.class.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/** 【案例5】 返回一个类实现的接口 */
		// 保存所有的接口
		Class<?> intes[] = demo.getInterfaces();
		if (intes != null) {
			for (Class<?> inte : intes) {
				System.out.println(Person1.class.getName() + "类实现的接口：" + inte.getName());
			}
		}

		/**
		 * （注意，以下几个例子，都会用到这个例子的Person类，所以为节省篇幅，此处不再粘贴Person的代码部分，只粘贴主类hello的代码）
		 */

		/** 【案例6】：取得其他类中的父类 */
		// 取得父类
		Class<?> temp = demo.getSuperclass();
		System.out.println("继承的父类为：" + temp.getName());

		/** 【案例7】：获得其他类中的全部构造函数 */
		Constructor<?> cons[] = demo.getConstructors();
		for (Constructor<?> con : cons) {
			System.out.println("构造方法：  " + con);
		}
		
		/** 【案例8】：public 或者private这一类的修饰符 */
		
		
		
		
	}
}

interface China {
	public static final String name = "Rollen";
	public static int age = 20;

	public void sayChina();

	public void sayHello(String name, int age);

}

class Person1 implements China {

	private String sex;

	public Person1() {

	}

	public Person1(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void sayChina() {
		System.out.println("hello, China");
	}

	@Override
	public void sayHello(String name, int age) {
		System.out.println(name + " " + age);
	}

}
