/**   
* @Title: TestThread.java 
* @author zhaozhu
* @date 2016年9月12日 上午11:36:13 
* @version V1.0   
*/
package study.zhaozhu.written_examination.dongruan;

/**
 * @ClassName: TestThread
 * @Description: TODO
 * @author zhaozhu
 * @date 2016年9月12日 上午11:36:13
 * 
 */
public class TestThread {
	// 考察进程--
	// 下面的程序输出结果是什么
	public static void main(String[] args) {
		//(new A()).start();
		//(new C()).start();
	}

}

class A extends Thread {
	A() {
		System.out.println("start A");
		setDaemon(true);
	}

	@Override
	public void run() {
		new B().start();
		try {
			System.out.println("A doing");
			long t1 = System.currentTimeMillis();
			Thread.sleep(6000);
			long t2 = System.currentTimeMillis();
			System.out.println("A : t2 - t1 = " + (t2 - t1));
		} catch (Exception e) {
			System.out.println("A done");
		}
	}

}

class B extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("B doing");
			long t1 = System.currentTimeMillis();
			Thread.sleep(12000);
			long t2 = System.currentTimeMillis();
			System.out.println("B : t2 - t1 = " + (t2 - t1));
		} catch (Exception e) {
			System.out.println("B done");
		}
	}
}

class C extends Thread {
	C() {
		System.out.println("start C");
		// setDaemon(true);
	}

	@Override
	public void run() {
		new B().start();
		try {
			System.out.println("C doing");
			long t1 = System.currentTimeMillis();
			Thread.sleep(6000);
			long t2 = System.currentTimeMillis();
			System.out.println("C : t2 - t1 = " + (t2 - t1));
		} catch (Exception e) {
			System.out.println("C done");
		}
	}

}