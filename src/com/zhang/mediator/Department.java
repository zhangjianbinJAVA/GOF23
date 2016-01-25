package com.zhang.mediator;

/**
 * 同事类的接口
 * 	
 * @author zhangjianbin
 *
 */
public interface Department {

	/**
	 * 做本部门的事
	 */
	void selfAction();
	
	/**
	 * 向总经理发出请求
	 */
	void outAction();	
	
}
