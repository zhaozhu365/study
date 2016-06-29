package study.zhaozhu.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTest {
	
	private static final String dateStr = "MM/dd";
	private static final String dateStr1 = "M月d日";
	
	public static void main(String[] args) {

		System.out.println(SpecialCharacterUtil.replaceCharacterForDate("长春:09/15,周四,-10--21°,13°,晴,西南风小于3级;"
				+ "09/16,周五,11-22°,晴,西南风3～4级;09/17,周六,18--2°,小雨,西风3～4级;09/18,周日,12-2°,多云,西风小于3级;"));
		
		
		// 转换日期用日期类
		String ss = "09/07";
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("M月d日");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("M/d");
		try {
//			Date d = sdf.parse(ss);
//			String sss = sdf2.format(d);
			
			//上边两句合并后，如下
			String sss = sdf2.format(sdf.parse(ss));
			System.out.println(sss);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
