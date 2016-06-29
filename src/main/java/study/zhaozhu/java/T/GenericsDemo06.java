package study.zhaozhu.java.T;
//package com.zz.test.T;
//
//public class GenericsDemo06 {
//
//	public static void main(String[] args) {
//		Info<Float> i1 = new InfoImpl<Float>(30.1f);
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
//class InfoImpl<T> implements Info<T> {
//
//	private T var;
//	
//	public InfoImpl(T var) {
//		this.setVar(var);
//	}
//	
//	public void setVar(T var) {
//		this.var = var;
//	}
//
//	@Override
//	public T getVar() {
//		return this.var;
//	}
//
//}