package com.zhang.strategy;

/**
 * 老客户大量购买策略
 *
 * @author zhangjianbin
 *
 */
public class OldCoustomerManyStrategy implements Strategy{
	@Override
	public double getPrice(double standprice) {
		System.err.println("老客户老客户大量购买算法：打8.5折");
		return standprice*0.9;
	}

}
