package com.zhang.factory.abstact;

/**
 * 轮胎
 * @author zhangjianbin
 *
 */
public interface Typre {
	void revole();
}

/**
 * 高级轮胎
 * @author zhangjianbin
 *
 */
class lunTypre implements Typre{

	@Override
	public void revole() {
		System.err.println("好轮胎");
	}
	
}

/**
 * 低级轮胎
 * @author zhangjianbin
 *
 */
class LowTyper implements Typre{
	@Override
	public void revole() {
		System.err.println("不好的轮胎");
	}	
}