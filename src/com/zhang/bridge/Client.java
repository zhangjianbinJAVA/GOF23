package com.zhang.bridge;

/**
 * 测试
 * @author zhangjianbin
 *
 */
public class Client {

	public static void main(String[] args) {
		Computer computer = new Desktop(new Dello());		
		computer.sale();
	}
	
}
