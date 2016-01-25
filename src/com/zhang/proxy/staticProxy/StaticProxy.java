package com.zhang.proxy.staticProxy;

public class StaticProxy implements Star {
	
	private RealStar realStar;
	
	public StaticProxy(RealStar realStar){
		this.realStar = realStar;
	}

	@Override
	public void confer() {
		System.out.println("于代理面谈");
		
	}

	@Override
	public void sing() {
		realStar.sing();
		System.out.println("代理调用真实的明星唱歌方法");
		
	}

	@Override
	public void cdlodMoney() {
		System.out.println("代理收钱");
		
	}

}
