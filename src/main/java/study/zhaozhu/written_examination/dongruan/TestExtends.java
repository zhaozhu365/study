/**   
* @Title: TestExtends.java 
* @author zhaozhu
* @date 2016年9月12日 上午11:03:53 
* @version V1.0   
*/
package study.zhaozhu.written_examination.dongruan;

/**
 * @ClassName: TestExtends
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月12日 上午11:03:53
 * 
 */
public class TestExtends extends Base {
	// 考察继承,
	// 考察继承关系中,构造方法的调用顺序
	// 下面的程序输出结果是什么
	public static void main(String[] args) {

		new Base();
		new Son1();
		new Son2();
	}
}

class Base {
	Base() {
		System.out.println("Base");
	}
}

class Son1 extends Base {
	Son1() {
		System.out.println("Son1");
	}
}

class Son2 extends Base {
}