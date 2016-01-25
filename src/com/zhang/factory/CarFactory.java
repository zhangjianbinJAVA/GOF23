package com.zhang.factory;

/**
 * 简单工厂
 * 
 * @author zhangjianbin
 * 
 */
public class CarFactory {
	private static Car c = null;

	public static Car createCar(String type) {
		if ("bc".equals(type)) {
			c = new BC();
			return c;
		} else if ("by".equals(type)) {
			c = new BY();
			return c;
		} else {
			return null;
		}
	}

}
