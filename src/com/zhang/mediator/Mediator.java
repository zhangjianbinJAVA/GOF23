package com.zhang.mediator;

/**
 * 中介者
 * 	   接口
 * @author zhangjianbin
 *
 */
public interface Mediator {

	void regiser(String name,Department d);//同事与总经理相互引用
	
	void command(String name); //中介(总经理)下发的命令
}
