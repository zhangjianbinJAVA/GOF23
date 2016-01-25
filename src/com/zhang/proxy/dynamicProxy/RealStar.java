package com.zhang.proxy.dynamicProxy;

public class RealStar implements Star {

	@Override
	public void confer() {
		System.err.println("于真实明星面谈");
		
	}

	@Override
	public void sing() {
		System.out.println("真实明星唱歌");
		
	}

	@Override
	public void cdlodMoney() {
		System.err.println("真实明星收钱");
		
	}

}
