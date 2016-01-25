package com.zhang.observer;

/**
 * 观察者
 * @author zhangjianbin
 *
 */
public class ObserverA implements Observer {

	/**
	 * 记录状态，与目标状态state 保持一致
	 */
	private int mystate;
	
	@Override
	public void update(Subject subject) {
		mystate= ((ConCreateSubject)subject).getState();
	}

	public int getMystate() {
		return mystate;
	}

	public void setMystate(int mystate) {
		this.mystate = mystate;
	}
	
	

}
