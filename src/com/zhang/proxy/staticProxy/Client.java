package com.zhang.proxy.staticProxy;

public class Client {
	
	public static void main(String[] args) {
	
		RealStar realStar = new RealStar();
		StaticProxy proxy = new StaticProxy(realStar);
		//代理方法调用真实明星的方法
		proxy.sing();
	}
		
}
