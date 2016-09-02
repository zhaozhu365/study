/**   
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年7月20日 下午4:10:39 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.clazz;

import java.lang.reflect.Constructor;

/**
 * @ClassName: FirstClass
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年7月20日 下午4:10:39
 * 
 */
public class HelloReflectClass {

	public static void main(String[] args) {

		/** 【案例1】通过一个对象获得完整的包名和类名 */
		ClazzDemo demo = new ClazzDemo();
		System.out.println(demo.getClass().getName());
		System.out.println(demo.getClass().getSimpleName());

		/** 【案例2】实例化Class类对象 */
		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		try {
			// 一般尽量采用这种方式, forName的参数必须是类的全路径:包名＋类名
			demo1 = Class.forName(demo.getClass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		demo2 = new ClazzDemo().getClass();
		demo3 = ClazzDemo.class;
		System.out.println("类名＝" + demo1.getName());
		System.out.println("类名＝" + demo2.getName());
		System.out.println("类名＝" + demo3.getName());

		/** 【案例3】通过Class实例化其他类的对象 */
		Class<?> demo4 = null;
		try {
			demo4 = Class.forName(Person.class.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person person = null;
		try {
			person = (Person) demo4.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		person.setName("LiLei");
		person.setAge(18);
		System.out.println(person);

		/** 【案例4】通过Class调用其他类中的构造函数|构造器 （也可以通过这种方式通过Class创建其他类的对象） */
		Class<?> demo5 = null;
		try {
			demo5 = Class.forName(Person.class.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person p1 = null;
		Person p2 = null;
		Person p3 = null;
		Person p4 = null;
		// 取得全部的构造函数
		Constructor<?> cons[] = demo5.getConstructors();
		try {
			System.out.println(cons.length);
			// TODO 下面的构造器调用,需要根据这里的cons数组来选择
			for (Constructor<?> con : cons) {
				System.out.println(con);
				// 这里的输出结果
				// public study.zhaozhu.java.clazz.Person(java.lang.String,int)
				// public study.zhaozhu.java.clazz.Person(int)
				// public study.zhaozhu.java.clazz.Person(java.lang.String)
				// public study.zhaozhu.java.clazz.Person()
			}
			p1 = (Person) cons[3].newInstance();
			p2 = (Person) cons[2].newInstance("HanMeimei");
			p3 = (Person) cons[1].newInstance(20);
			p4 = (Person) cons[0].newInstance("HanMeimei", 20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}

}

/**
 * class 1
 * 
 * @ClassName: ClazzDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年7月20日 下午4:30:40
 *
 */
class ClazzDemo {

}

/**
 * class 2
 * 
 * @ClassName: Person
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年7月20日 下午4:30:59
 *
 */
class Person {

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
