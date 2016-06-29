/**   
* @Title: TestThreadPoolExecutor.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月1日 下午4:30:34 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: TestThreadPoolExecutor
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu@luobotec.com
 * @date 2016年6月1日 下午4:30:34
 * 
 */
public class TestThreadPoolExecutor {

	public static void main(String[] args) {
		// Executor线程池的4种构造方法
	}

	public static void TestThreadPoolExecutor1() {
		ExecutorService executor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.MINUTES,
				new LinkedBlockingQueue<Runnable>());
	}

	public static void TestThreadPoolExecutor2() {
		ExecutorService executor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.MINUTES,
				new LinkedBlockingQueue<Runnable>(), new ThreadPoolExecutor.CallerRunsPolicy());
	}

	public static void TestThreadPoolExecutor3() {
		ExecutorService executor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.MINUTES,
				new LinkedBlockingQueue<Runnable>(), Executors.defaultThreadFactory());
	}

	public static void TestThreadPoolExecutor4() {
		ExecutorService executor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.MINUTES,
				new LinkedBlockingQueue<Runnable>(), Executors.defaultThreadFactory(),
				new ThreadPoolExecutor.CallerRunsPolicy());
	}

}
