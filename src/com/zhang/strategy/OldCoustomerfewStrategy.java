package com.zhang.strategy;

/**
 * 老客户小量购买策略
 *
 * @author zhangjianbin
 *
 */
public class OldCoustomerfewStrategy implements Strategy{
	@Override
	public double getPrice(double standprice) {
		System.err.println("老客户小量购买算法：打9折");
		return standprice*0.9;
	}

}
