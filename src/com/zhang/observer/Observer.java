package com.zhang.observer;

/**
 * 观察者接口
 * 		
 * @author zhangjianbin
 *
 */
public interface Observer {
	
	//更新观察者
	void update(Subject subject);	
}
