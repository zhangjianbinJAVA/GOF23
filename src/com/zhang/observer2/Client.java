package com.zhang.observer2;

public class Client {

	public static void main(String[] args) {
		
		//目标对象
		Subject subject = new Subject();
		
		//观察者
		Observer2 obj1 = new  Observer2();
		Observer2 obj2 = new  Observer2();
		Observer2 obj3 = new  Observer2();
		
		//添加观察者
		subject.addObserver(obj1);
		subject.addObserver(obj2);
		subject.addObserver(obj3);
		
		subject.setState(3000);
		
		System.err.println(obj1.getMystate()); //3000 
		System.err.println(obj2.getMystate()); //3000
		System.err.println(obj3.getMystate()); //3000
		
	}
}
