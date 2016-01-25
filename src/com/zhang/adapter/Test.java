package com.zhang.adapter;

import java.awt.RenderingHints.Key;

import prototype.Clinet;

/**
 * 测试
 * 
 * @author zhangjianbin
 * 
 */
public class Test {
	public static void main(String[] args) {
		Client clinet = new Client(); // 客户端

		Ps2KeyBoard keyBoard = new Ps2KeyBoard(); // 被适配对象

		// Usb usb = new Adapter1(); // 适配器

		Usb usb = new Adapter2(keyBoard);
		
		clinet.handleReq(usb); // 发送请求

	}
}
