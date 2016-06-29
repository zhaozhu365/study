/**   
* @Title: TestDate_SDF.java 
* @Description: TODO
* @author zhaozhu@luobotec.com
* @date 2016年6月13日 下午3:46:11 
* @powered by 北京萝卜科技有限公司
* @version V1.0   
*/
package study.zhaozhu.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

/** 
* @ClassName: TestDate_SDF 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhaozhu@luobotec.com
* @date 2016年6月13日 下午3:46:11 
*  
*/
public class TestDate_SDF {
	public static void main(String[] args) {
		
		String[] ss = {"前天","昨天","今天","明天","后天"};
		
		for (String str : ss) {
			System.out.println(getWeekOfDate(str));
		}
		System.out.println(getWeekOfDate(""));
	}

	 /**
     * 获取当前日期是星期几<br>
     * 
     * @param dt
     * @return 当前日期是星期几
	 * @throws ParseException 
     */
    public static String getWeekOfDate(String day) {
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date d = new Date();
		try {
			d = sdf.parse(convertQueryDay(day));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;

        return weekDays[w];
    }
	
	private static String convertQueryDay(String timeStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		Date now = new Date();
		if (StringUtils.isEmpty(timeStr)) {
			return sdf.format(now);
		}
		
		if (timeStr.contains("今天")) {
			return sdf.format(now);
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		
		if (timeStr.contains("前天")) {
			cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 2);
			return sdf.format(cal.getTime());
		}
		if (timeStr.contains("昨天")) {
			cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 1);
			return sdf.format(cal.getTime());
		}
		if (timeStr.contains("明天")) {
			cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 1);
			return sdf.format(cal.getTime());
		}
		if (timeStr.contains("后天")) {
			cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 2);
			return sdf.format(cal.getTime());
		}

		timeStr.replaceAll("年", "-");
		timeStr.replaceAll("月", "-");
		timeStr.replaceAll("日", "-");
		timeStr.replaceAll("/", "-");

		try {
			sdf.parse(timeStr);
		} catch (ParseException e) {
			System.out.println("WeatherTask:" + "不能识别的日期");
			return sdf.format(now);
		}

		return timeStr;
	}

}
