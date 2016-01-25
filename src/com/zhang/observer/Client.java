package com.zhang.observer;

public class Client {

	public static void main(String[] args) {
		/**
		 * 创建目标对象
		 */
		ConCreateSubject con = new ConCreateSubject();
		
		/**
		 * 创建多个观察者
		 */
		ObserverA obj1 = new ObserverA();
		ObserverA obj2 = new ObserverA();
		ObserverA obj3 = new ObserverA();
	
		con.registerObjserver(obj1);
		con.registerObjserver(obj2);
		con.registerObjserver(obj3);
	
		/**
		 * 修改目标对象的状态
		 */
		con.setState(300);
		
		/**
		 * 通知所有的观察者，目标对象状态发生了变化
		 */
		con.notififyAllObjserver();
		
		/**
		 * 所有观察者的状态
		 */
		System.err.println(obj1.getMystate());  //300
		System.err.println(obj2.getMystate());  //300
		System.err.println(obj3.getMystate());  //300
		
	}
}
