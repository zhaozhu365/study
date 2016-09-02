/**   
* @Title: ExecutorAndFuture.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月1日 下午5:32:19 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.executor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ClassName: ExecutorAndFuture
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年6月1日 下午5:32:19
 * 
 */
public class ProducerConsumer {

	public static void main(String[] args) {

		Storage s = new Storage();

		ExecutorService service = Executors.newCachedThreadPool();
		Producer p1 = new Producer("生产者1", s);

		Consumer c1 = new Consumer("消费者1", s);
		Consumer c2 = new Consumer("消费者2", s);
		Consumer c3 = new Consumer("消费者3", s);

		service.submit(p1);
		service.submit(c1);
		service.submit(c2);
		service.submit(c3);

		service.shutdown();

	}

	/**
	 * 消费者
	 */
	private static class Consumer implements Runnable {

		private String name;
		private Storage s = null;

		public Consumer() {
		}

		public Consumer(String name, Storage s) {
			this.name = name;
			this.s = s;
		}

		@Override
		public void run() {
			try {
				while (true) {
					Product product = s.pop();
					System.out.println(name + "已消费(" + product.toString() + ").");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * 生产者
	 */
	private static class Producer implements Runnable {

		private String name;
		private Storage s = null;

		public Producer() {
		}

		public Producer(String name, Storage s) {
			this.name = name;
			this.s = s;
		}

		@Override
		public void run() {
			try {
				for (int i = 0; i < 100; i++) {
					// Product product = new Product((int) (Math.random() *
					// 10000));// 产生0~9999随机整数
					Product product = new Product(i);// 产生0~9999随机整数
					s.push(product);
					Thread.sleep(10);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * 仓库
	 */
	private static class Storage {
		public BlockingQueue<Product> queues = new LinkedBlockingQueue<Product>(10);

		/**
		 * 生产产品
		 * 
		 * @param p
		 * @throws InterruptedException
		 */
		public void push(Product p) throws InterruptedException {
			queues.put(p);
		}

		/**
		 * 消费产品
		 * 
		 * @return
		 * @throws InterruptedException
		 */
		public Product pop() throws InterruptedException {
			return queues.take();
		}

	}

	/**
	 * 产品类
	 */
	private static class Product {

		private int id;

		public Product() {
		}

		public Product(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + "]";
		}

	}
}