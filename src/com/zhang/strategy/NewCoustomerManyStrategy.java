package com.zhang.strategy;

/**
 * 新客户大量购买策略
 *
 * @author zhangjianbin
 *
 */
public class NewCoustomerManyStrategy implements Strategy{
	@Override
	public double getPrice(double standprice) {
		System.err.println(" 新客户大量购买算法：打9.5折");
		return standprice*0.95;
	}

}
