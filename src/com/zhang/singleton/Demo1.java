package com.zhang.singleton;

import java.io.Serializable;

import javax.management.RuntimeErrorException;

/**
 * 懒汉式
 * @author zhangjianbin
 *
 */
public class Demo1 implements Serializable {
	private static  Demo1 s = null;
	private Demo1() {	
		if(s !=null){
			throw new RuntimeException();
		}
	}
	public static synchronized Demo1 instance() {
		if(s == null){
			s = new Demo1();
		}
		return s;
	}
	
	//阻止反序列化破解
	private Object readResolve(){
		return s;
	}
}
