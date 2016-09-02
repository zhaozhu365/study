/**   
* @Title: FirstExecutor.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月1日 上午10:15:42 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: FirstExecutor
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年6月1日 上午10:15:42
 * 
 */
public class FirstExecutor {

	public static void main(String[] args) {
		// TestNewCachedThreadPool();
		// TestNewFixedThreadPool();
		// TestNewScheduledThreadPool();
		TestNewSingleThreadExecutor();
	}

	/**
	 * 1,创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
	 * 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
	 */
	public static void TestNewCachedThreadPool() {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			try {
				Thread.sleep(index * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			cachedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(index + "   " + Thread.currentThread().getId());
				}
			});
		}
	}

	/**
	 * 2,创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
	 * 定长线程池的大小最好根据系统资源进行设置。如Runtime.getRuntime().availableProcessors()。
	 * 可参考PreloadDataCache。
	 */
	public static void TestNewFixedThreadPool() {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			final int index = i;

			fixedThreadPool.execute(new Runnable() {
				@Override
				public void run() {

					try {
						System.out.println(index + "   " + Thread.currentThread().getId());
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	/**
	 * 3,创建一个定长线程池，支持定时及周期性任务执行。
	 */
	public static void TestNewScheduledThreadPool() {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		// 延迟执行示例代码如下：
		// 表示延迟3秒执行。
		// scheduledThreadPool.schedule(new Runnable() {
		// @Override
		// public void run() {
		// System.out.println("delay 3 seconds" + " " +
		// Thread.currentThread().getId());
		// }
		// }, 3, TimeUnit.SECONDS);

		// 定期执行示例代码如下：
		// 表示延迟1秒后每3秒执行一次。
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out
						.println("delay 1 seconds, and excute every 3 seconds" + "  " + Thread.currentThread().getId());
			}
		}, 1, 3, TimeUnit.SECONDS);
	}

	/**
	 * 4,创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。示例代码如下：
	 * 结果依次输出，相当于顺序执行各个任务。
	 * 
	 * 现行大多数GUI程序都是单线程的。Android中单线程可用于数据库操作，文件操作，应用批量安装，
	 * 应用批量删除等不适合并发但可能IO阻塞性及影响UI线程响应的操作。
	 */
	public static void TestNewSingleThreadExecutor() {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable() {

				@Override
				public void run() {
					System.out.println(index);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

}
