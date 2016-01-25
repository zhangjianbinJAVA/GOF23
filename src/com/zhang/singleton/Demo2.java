package com.zhang.singleton;

/**
 * 双重检查锁实现单例
 * @author zhangjianbin
 *
 */
public class Demo2 {

	private static Demo2 instance = null;

	private Demo2() {
	}

	public static Demo2 getInstance() {
		if (instance == null) {
			Demo2 sc;
			synchronized (Demo2.class) {
				sc = instance;
				if (sc == null) {
					synchronized (Demo2.class) {
						if (sc == null) {
							sc = new Demo2();
						}
					}
				}

				instance = sc;
			}
		}

		return instance;

	}

}
