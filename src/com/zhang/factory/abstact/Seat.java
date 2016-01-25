package com.zhang.factory.abstact;

/**
 * 座
 * @author zhangjianbin
 *
 */
public interface Seat {

	void masseage();
}

/**
 * 高级座
 * @author zhangjianbin
 *
 */
class lunSeat implements Seat {
	@Override
	public void masseage() {
		System.err.println("高端按摩");
	}

}

/**
 * 低级座
 * @author zhangjianbin
 *
 */
class LowSeat implements Seat {
	@Override
	public void masseage() {
		System.err.println("低端按摩");		
	}
}
