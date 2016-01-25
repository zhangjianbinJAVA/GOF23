package com.zhang.proxy.staticProxy;

/**
 * 明星抽象接口
 * 	1.抽取代理类和真实明星类的公共方法
 * @author zhangjianbin
 *
 */
public interface Star {

	/**
	 * 面谈
	 */
	void confer();
	
	/**
	 * 唱歌
	 */
	void sing();
	
	/**
	 * 收钱
	 */
	void cdlodMoney();
}
