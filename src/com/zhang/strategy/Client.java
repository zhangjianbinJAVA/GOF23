package com.zhang.strategy;

public class Client {

	public static void main(String[] args) {
		/**
		 * 采用老客户大量购买策略算法
		 */
		Strategy strategy = new OldCoustomerManyStrategy();
		
		/**
		 * 管理算法对象  
		 * 		根据注入的算法，自动进行打折计算
		 */
		Context context = new Context(strategy);
		
		
		/**
		 * 打折算法计算后的价格
		 * 			传入原价
		 */
		context.pringPrice(8220);
		
		/**
		 * 结果：
		 * 老客户老客户大量购买算法：打8.5折
		 *	策略算法报价：7398.0
		 */
		
	}
}
