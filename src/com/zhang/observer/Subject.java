package com.zhang.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者 目标对象
 * 		主题
 * @author zhangjianbin
 *
 */
public class Subject {

	/**
	 * 存入所有的观察者
	 */
	List<Observer> list = new ArrayList<Observer>();
	
	
	/**
	 * 添加观察者
	 * @param objserver
	 */
	public void registerObjserver(Observer objserver){
		list.add(objserver);
	}
	
	/**
	 * 移动观察者
	 * @param objserver
	 */
	public void removeObjserver(Observer objserver){
		list.remove(objserver);
	}
	
	/**
	 * 通知所有的观察者
	 */
	public void notififyAllObjserver(){
		for (Observer obs : list) {
			obs.update(this);
		}
	}
	
	
	
}
