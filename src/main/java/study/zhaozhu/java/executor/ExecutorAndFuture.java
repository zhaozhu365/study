/**   
* @Title: ExecutorAndFuture.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月1日 下午5:32:19 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName: ExecutorAndFuture
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年6月1日 下午5:32:19
 * 
 */
public class ExecutorAndFuture {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();
		Task task = new Task();
		Future<Integer> future = executor.submit(task);
		executor.shutdown();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("主线程在执行任务....");

		try {
			System.out.println("task运行结果:" + future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println("所有任务执行完毕");

	}

	private static class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			System.out.println("子线程正在进行计算...");
			Thread.sleep(3000);
			int sum = 0;
			for (int i = 0; i < 100; i++) {
				sum += i;
			}
			return sum;
		}

	}

}
