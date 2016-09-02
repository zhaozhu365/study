/**   
* @Title: TestFuture.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月2日 下午2:37:38 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName: TestFuture
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年6月2日 下午2:37:38
 * 
 */
public class TestFuture implements Future<Object> {

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		return null;
	}

	class TestFutureTask<Object> implements RunnableFuture<Object> {

		@Override
		public boolean cancel(boolean mayInterruptIfRunning) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isCancelled() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isDone() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object get() throws InterruptedException, ExecutionException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object get(long timeout, TimeUnit unit)
				throws InterruptedException, ExecutionException, TimeoutException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}
	
	interface TestRunnableFuture<V> extends Runnable, Future<V> {

		@Override
		void run();

	}
	
	
	
}
