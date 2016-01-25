package com.zhang.factory.abstact;

/**
 * 引擎
 * @author zhangjianbin
 *
 */
public interface Engine {

	void run();

	void start();
}

/**
 * 高端引擎
 * @author zhangjianbin
 *
 */
class lunEngine implements Engine {

	@Override
	public void run() {
		System.err.println("跑的快");
	}

	@Override
	public void start() {
		System.err.println("启动快");
	}

}

/**
 * 低端引擎
 * @author zhangjianbin
 *
 */
class LowEngine implements Engine {
	@Override
	public void run() {
		System.err.println("跑的慢");
	}

	@Override
	public void start() {
		System.err.println("启动慢");
	}
}
