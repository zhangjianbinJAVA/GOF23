package com.zhang.strategy;

import org.omg.CORBA.portable.Streamable;

/**
 * 管理策略算法
 * 	负责与俱类的策略类交互
 * 	
 * 	优点：
 * 		俱体的算法和直接与客户端之间的调用分离了
 * 		使算法可以独立于客户端变化
 * @author zhangjianbin
 *
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void pringPrice(double standprice){
		System.err.println("策略算法报价："+strategy.getPrice(standprice));
	}
	
}
