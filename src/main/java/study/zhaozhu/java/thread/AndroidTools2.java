/**   
* @Title: AndroidTools.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月7日 下午1:59:55 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: AndroidTools
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaozhu
 * @date 2016年6月7日 下午1:59:55
 * 
 */
public class AndroidTools2 {

	private static final String TAG = AndroidTools2.class.getSimpleName();

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			backPressed();
		}
		System.out.println("backPressed");
	}

	private static ExecutorService executorService = Executors.newSingleThreadExecutor();

	/** "返回操作"任务 */
	private static Runnable backPressRunnable = new Runnable() {
		@Override
		public void run() {
//1			// 这个方法是不能写在你的主线程里面的，所以你要自己开个线程用来执行
//			Instrumentation inst = new Instrumentation();
//			try {
//				inst.sendKeyDownUpSync(KeyEvent.KEYCODE_BACK);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
			
//2,延迟较高	Runtime runtime = Runtime.getRuntime();  
//	        try {  
//	              
//	            runtime.exec("input keyevent " + KeyEvent.KEYCODE_BACK);  
//	              
//	        } catch (IOException e) {  
//	        }  
			
			// 这个方法是不能写在你的主线程里面的，所以你要自己开个线程用来执行
			System.out.println("backPressed");
		}
	};

	/**
	 * 执行"返回键"操作
	 */
	public static void backPressed() {
		executorService.execute(backPressRunnable);
	}

}
