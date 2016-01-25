package com.zhang.strategy;

/**
 * 新客户小量购买策略
 *
 * @author zhangjianbin
 *
 */
public class NewCoustomerfewStrategy implements Strategy{
	@Override
	public double getPrice(double standprice) {
		System.err.println("新客户小量购买算法：不打折");
		return standprice;
	}

}
