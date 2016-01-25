package com.zhang.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {

		//真实对象
		RealStar realStar = new RealStar();
		
		//处理对象
		StarHand starHand = new StarHand(realStar);
		//动态生成代理对象
		Star star = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class},starHand);
		
		//通过代理对象调用真实对象的方法
		star.sing();
	}
}
