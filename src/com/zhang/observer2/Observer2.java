package com.zhang.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * @author zhangjianbin
 *
 */
public class Observer2 implements Observer {
	
	private int mystate;

	@Override
	public void update(Observable o, Object arg) {		
		this.mystate = ((Subject)o).getState();
	}

	public int getMystate() {
		return mystate;
	}

	public void setMystate(int mystate) {
		this.mystate = mystate;
	}
}
