package study.zhaozhu.java.T;
//package com.zz.test.T;
//
//public class GenericsDemo09 {
//
//	public static void main(String[] args) {
//		Info<Integer> i = fun(30);
//		System.out.println(i.getVar());
//	}
//
//	public static <T extends Number> Info<T> fun(T param) {// 方法中传入或返回的泛型类型由调用方法时所设置的参数类型决定
//		Info<T> temp = new Info<T>();
//
//		temp.setVar(param);
//
//		return temp;
//
//	}
//
//}
//
//class Info<T extends Number> {
//
//	private T var;
//
//	public T getVar() {
//		return this.var;
//	}
//
//	public void setVar(T var) {
//		this.var = var;
//	}
//
//	@Override
//	public String toString() {
//		return "Info [var=" + var + "]";
//	}
//
//}