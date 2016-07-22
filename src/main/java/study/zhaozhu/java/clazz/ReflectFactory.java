/**   
* @Title: ReflectFactory.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年7月22日 下午2:52:27 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.clazz;

/**
 * @ClassName: ReflectFactory
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年7月22日 下午2:52:27
 * 
 */
public class ReflectFactory {

	public static void main(String[] args) {
		Fruit f = Factory.getInstance(Apple.class);
		if (f != null) {
			f.eat();
		}
	}

}

class Factory {
	public static Fruit getInstance(Class<?> clazz) {
		Fruit fruit = null;
		try {
			fruit = (Fruit) clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fruit;
	}
}

interface Fruit {
	public abstract void eat();
}

class Apple implements Fruit {
	@Override
	public void eat() {
		System.out.println(Apple.class.getSimpleName());
	}
}

class Orange implements Fruit {
	@Override
	public void eat() {
		System.out.println(Orange.class.getSimpleName());
	}
}
