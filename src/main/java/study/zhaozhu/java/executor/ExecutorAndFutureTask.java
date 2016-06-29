/**   
* @Title: ExecutorAndFutureTask.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月2日 下午3:41:22 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.executor;

import java.util.concurrent.Callable;

/** 
* @ClassName: ExecutorAndFutureTask 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhaozhu@luobotec.com
* @date 2016年6月2日 下午3:41:22 
*  
*/
public class ExecutorAndFutureTask {
	public static void main(String[] args) {
		
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
