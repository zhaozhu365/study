package study.zhaozhu.java.T;
//package com.zz.test.T;
//
//public class GenericsDemo05 {
//
//	public static void main(String[] args) {
//		Info<Float> i1 = new SubInfo<Float>();
//		i1.setVar(30.1f);
//		
//		System.out.println(i1);
//		
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
//
///**
// * 范型继承
// * @author zhaozhu
// *
// * @param <T>
// */
//class SubInfo<T> extends Info<T> {
//
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
//		return "SubInfo [var=" + var + "]";
//	}
//
//}