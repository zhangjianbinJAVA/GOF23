package com.zhang.observer2;

import java.util.Observable;

/**
 * 目标类
 * @author zhangjianbin
 *
 */
public class Subject extends Observable {

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;

		this.setChanged();// 目标对象更变了

		this.notifyObservers(state);// 通知所有的观察者

	}

}
