/**   
* @Title: TestDate_SDF.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月13日 下午3:46:11 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/** 
* @ClassName: TestDate_SDF 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhaozhu@luobotec.com
* @date 2016年6月13日 下午3:46:11 
*  
*/
public class TestHM {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getHours() + ":" + d.getMinutes());
		
//		Calendar cal = Calendar.getInstance(Locale.getDefault());
		Calendar cal = Calendar.getInstance();
//		cal.setTime(d);
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
		
	}
	
	
	
}
