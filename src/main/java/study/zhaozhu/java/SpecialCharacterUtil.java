package study.zhaozhu.java;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 特殊字符处理
 * @author zhaozhu
 *
 */
public class SpecialCharacterUtil {

	/**
	 *  用正则获取特殊字符串，然后再对串进行处理；
	 *  
	 */
	public static String replaceCharacter(String text) {
		
		//正则表达式，获取+-*/=等算术字符串；
		//任务数，（可以是整数，浮点数）[0-9]+\\.?[0-9]*	
		//加减乘除 [\\+\\-\\*/]
		String regex = "(-?[0-9]+\\.?[0-9]*)([\\+\\-\\*/][0-9]+\\.?[0-9]*)+=(-?[0-9]+\\.?[0-9]*)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()){
			String temp = text.substring(matcher.start(),matcher.end());
//			System.out.println("temp:"+temp);
			//处理减法和除法
			String temp1 = temp.replace('-', '减');
//			System.out.println("temp1:"+temp1);
			temp1 = temp1.replace('/', '除');
//			System.out.println("temp1:"+temp1);
//			System.out.println("text:"+text);
			text = text.replace(temp, temp1);
//			System.out.println("text:"+text);
		}
		//处理正负号
		char[] chars = text.toCharArray();
		if(chars[0] == '减'){
			chars[0] = '负';
		}
		for(int i = 0; i < chars.length - 1; i++){
			if(chars[i] == '=') {
				if(chars[i+1] == '减'){
					chars[i+1] = '负';
				}
			}
		}
		text = String.valueOf(chars);
//		System.out.println("text:"+text);
		
		
/*此处理方法不对		
		char[] chars = text.toCharArray();
		1+1=2
		01234
			  5	- 3
		for(int i = 0; i < chars.length - 3; i++){
			if(Character.isDigit(chars[i]) 
				&& chars[i+1] == '-'
				&& Character.isDigit(chars[i+2])
				&& chars[i+3] == '°'){
				break;
			}else if(Character.isDigit(chars[i]) 
					&& chars[i+1] == '-'
					&& Character.isDigit(chars[i+2])) {
				chars[i+1] = '减';
			}
			
			if(Character.isDigit(chars[i]) 
				&& chars[i+1] == '/'
				&& Character.isDigit(chars[i+2])
				&& chars[i+3] == '='){
				chars[i+1] = '除';
			}
		}
		
		text = String.valueOf(chars);*/
		
		
		if (text.contains("+")) {
			text = text.replace("+", "加");
		}
		/*if (text.contains("-")) {
			text = text.replace("-", "减");
		}*/
		if (text.contains("=")) {
			text = text.replace("=", "等于");
		}
		if (text.contains("＊")) {
			text = text.replace("＊", "乘");
		}
		if (text.contains("&")) {
			text = text.replace("&", "和");
		}
		if (text.contains("%")) {
			text = text.replace("%", "百分比");
		}
		if (text.contains("$")) {
			text = text.replace("$", "美元");
		}
		if (text.contains("#")) {
			text = text.replace("#", "井号");
		}
		if (text.contains("@")) {
			text = text.replace("@", "艾特");
		}
		if (text.contains("＋")) {
			text = text.replace("＋", "加");
		}
		/*if (text.contains("－")) {
			text = text.replace("－", "减");
		}*/
		if (text.contains("＝")) {
			text = text.replace("＝", "等于");
		}
		if (text.contains("*")) {
			text = text.replace("*", "乘");
		}
		if (text.contains("&")) {
			text = text.replace("&", "和");
		}
		if (text.contains("％")) {
			text = text.replace("％", "百分比");
		}
		if (text.contains("¥")) {
			text = text.replace("¥", "元");
		}
		if (text.contains("#")) {
			text = text.replace("＃", "井号");
		}
		if (text.contains("@")) {
			text = text.replace("@", "艾特");
		}
		
		return text;
	}
	
	/**
	 *  用正则获取特殊字符串，然后再对串进行处理；
	 *  
	 */
	public static String replaceCharacterForDate(String text) {
		
		//正则表达式，获取+-*/=等算术字符串；
		//任务数，（可以是整数，浮点数）[0-9]+\\.?[0-9]*	
		//加减乘除 [\\+\\-\\*/]
		String regex = "([0-9]{2}/[0-9]{2},)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		List<String> list = new ArrayList<>();
		
		//直接用正则表达式替换字符串时，不能改变字符串的字符的位置，即不能进行字符数的增减，否则位置会出错。
		//因为这样，这里只用正则来找 需要的字符串，缓存下来，然后另外去做替换
		while(matcher.find()){
			String temp = text.substring(matcher.start(),matcher.end() - 1);
			list.add(temp);
		}
		
		for(String temp : list) {
			String temp1 = temp.replace('/', '月');
			temp1 = temp1.replace("01", "1");
			temp1 = temp1.replace("02", "2");
			temp1 = temp1.replace("03", "3");
			temp1 = temp1.replace("04", "4");
			temp1 = temp1.replace("05", "5");
			temp1 = temp1.replace("06", "6");
			temp1 = temp1.replace("07", "7");
			temp1 = temp1.replace("08", "8");
			temp1 = temp1.replace("09", "9");
			temp1 = temp1 + "日";
			
			text = text.replace(temp, temp1);
		}
		
		// 处理-2-1°、-2--4°、2--1°、这样的字符串;
		// 处理方案：匹配“数字后面加一个-”，将数字后面第一个"-"替换成"到"，其他的替换成“零下”
		String regex1 = "([0-9]{1,}-)";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(text);
		while(matcher1.find()){
			String temp = text.substring(matcher1.start(), matcher1.end());
			System.out.println(temp);
			String temp1 = temp.replace('-', '到');
			System.out.println(temp1);
			text = text.replace(temp, temp1);
			System.out.println(text);
		}
		text = text.replace("-", "零下");
		System.out.println(text);
		
		return text;
	}
	
	
}
