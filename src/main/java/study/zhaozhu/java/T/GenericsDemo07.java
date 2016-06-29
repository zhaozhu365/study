package study.zhaozhu.java.T;
//package com.zz.test.T;
//
//public class GenericsDemo07 {
//
//	public static void main(String[] args) {
//		Info<?> i1 = new InfoImpl("汤姆");
//		
//
//		System.out.println(i1);
//		System.out.println(i1.getVar());
//
//	}
//
//}
//
///**
// * 范型接口
// * 
// * @author zhaozhu
// *
// * @param <T>
// */
//interface Info<T> {// 在接口上定义泛型
//	// 定义抽象方法，抽象方法的返回值就是泛型类型
//	public T getVar();
//
//}
//
//class InfoImpl implements Info<String> {
//
//	private String var;
//	
//	public InfoImpl(String var) {
//		this.setVar(var);
//	}
//	
//	public void setVar(String var) {
//		this.var = var;
//	}
//
//	@Override
//	public String getVar() {
//		return this.var;
//	}
//
//}