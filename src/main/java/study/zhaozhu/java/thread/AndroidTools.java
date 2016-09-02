/**   
* @Title: AndroidTools.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月7日 下午1:59:55 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.thread;


/** 
* @ClassName: AndroidTools 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhaozhu
* @date 2016年6月7日 下午1:59:55 
*  
*/
public class AndroidTools {
	
	private static final String TAG = AndroidTools.class.getSimpleName();
	
	public static void main(String[] args) {
		backPressed();
		backPressed();
	}
	
	/**
	 * 执行"返回键"操作
	 */
	public static void backPressed(){
//		Runtime runtime = Runtime.getRuntime();
//		try {
//			runtime.exec("input keyevent " + KeyEvent.KEYCODE_BACK);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		th.start();
		
		
	}
	
	private static Thread th = new Thread() {
		public void run() { // 这个方法是不能写在你的主线程里面的，所以你要自己开个线程用来执行
			System.out.println("test---thread");
		};
	};
	
}
