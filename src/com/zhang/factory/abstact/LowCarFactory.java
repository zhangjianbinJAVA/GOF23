package com.zhang.factory.abstact;

/**
 * 
 * 低端工厂创建低端产品
 * 
 * @author zhangjianbin
 * 
 */
public class LowCarFactory implements CarFactory {

	@Override
	public Engine CreateEngine() {
		return new LowEngine();
	}

	@Override
	public Seat CreateSeat() {
		return new LowSeat();
	}

	@Override
	public Typre CreateTypre() {
		return new LowTyper();
	}

}