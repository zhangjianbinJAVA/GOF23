package com.zhang.singleton;

/**
 * 静态内部类实现单例
 * 
 * @author zhangjianbin
 * 
 */
public class Demo3 {
	private Demo3() {
	}

	private static class InnerClass {
		private static final Demo3 sc = new Demo3();
	}

	public static Demo3 getInstance() {
		return InnerClass.sc;
	}

}
