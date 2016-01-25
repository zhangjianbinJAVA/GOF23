package com.zhang.factory.abstact;

/**
 * 高端工厂创建高端产品
 * @author zhangjianbin
 *
 */
public class LunCarFactory implements CarFactory{

	@Override
	public Engine CreateEngine() {
		
		return new lunEngine();
	}

	@Override
	public Seat CreateSeat() {
		
		return new lunSeat();
	}

	@Override
	public Typre CreateTypre() {
		return new lunTypre();
	}

	
}