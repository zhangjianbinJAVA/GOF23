package com.zhang.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 处理器对象
 * 	实现对真实角色的访问
 * @author zhangjianbin
 *
 */
public class StarHand implements InvocationHandler {
	
	private Star star;
	
	//参收真实的调用对象
	public StarHand(Star realStar){
		this.star = realStar;
	}
	

	/**
	 * 动态产生的代理对象都要调用这个方法
	 * 参数：
	 * 	Object proxy 代理对象
	 * 	Method method 正在调用的方法
	 * 	Object[] args 调用方法的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		//调用方法的返回值
		Object obj = null;
	
		//前处理
		System.err.println("前处理:面谈");
		if(method.getName().equals("sing")){
			//真实对象的方法
			obj = method.invoke(star, args);
		}	
		//后处理
		System.out.println("后处理:收钱");	
		
		return obj;
	}

}
