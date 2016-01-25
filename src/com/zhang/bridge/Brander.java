package com.zhang.bridge;

/**
 * 桥接模式
 * 		实现多维度变化的类
 * 		新添加品牌类时，其它产品也天然的俱备了个种品牌了
 * @author zhangjianbin
 *
 */
public interface Brander {

	//销售电脑
	void sale();
	
}

/**
 * 销售联想电脑
 * @author zhangjianbin
 *
 */
class Leveo implements Brander{
	@Override
	public void sale() {
		System.err.println("销售联想电脑");		
	}	
}

/**
 * 销售戴尔电脑
 * @author zhangjianbin
 *
 */
class Dello implements Brander{
	@Override
	public void sale() {
		System.err.println("销售戴尔电脑");		
	}	
}