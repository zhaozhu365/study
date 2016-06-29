package study.zhaozhu.java.T;
//package com.zz.test.T;
//
//public class GenericsDemo04 {
//
//	public static void main(String[] args) {
//		Info<Integer> i1 = new Info<Integer>();
//		Info<Float> i2 = new Info<Float>();
//		i1.setVar(30);
//		i2.setVar(30.1f);
////		fun(i1);
////		fun(i2);
//		
//		// 编译不通过,因为方法fun中为受限范型,只能接收Number及其Number的子
////		Info<String> i3 = new Info<String>();
////		i3.setVar("30");
////		fun(i3);
//		
//		
//		Info<String> i4 = new Info<String>();
//		Info<Object> i5 = new Info<Object>();
//		i4.setVar("zxczxc");
//		i5.setVar(new Object());
//		fun1(i4);
//		fun1(i5);
//		
//		// 编译不通过,因为方法fun1中为受限范型,只能接收String或Object类型的
////		Info<Integer> i6 = new Info<Integer>();
////		i6.setVar(30);
////		fun1(i6);
//		
//	}
//	
//	
//	// 范型上限extends
//	public static void fun(Info<? extends Number> temp) {
//		System.out.println(temp);
//	}
//
//	// 范型下限super
//	public static void fun1(Info<? super String> temp) {
//		System.out.println(temp);
//	}
//
//}
//
//class Info<T> {
//	private T var;
//	
//	public T getVar() {
//		return var;
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
//
