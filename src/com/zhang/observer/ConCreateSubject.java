package com.zhang.observer;

/**
 * 创建主题
 * @author zhangjianbin
 *
 */
public class ConCreateSubject extends Subject {

	/**
	 * 记录目标主题壮态
	 */
	private int state;

	public int getState() {
		return state;
	}

	/**
	 * 当状态发生变化时，通知所有观察者
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
		
		this.notififyAllObjserver();
	}
	
	
}
