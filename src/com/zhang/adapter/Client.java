package com.zhang.adapter;

import prototype.Clinet;

/**
 * 客户端 ： 相当于笔记本 只有usb接口
 * 
 * @author zhangjianbin
 * 
 */
public class Client {

	//需要一个usb接口
	public void handleReq(Usb t) {
		/**
		 * 发送打字请求
		 */
		t.handleReq();
	}

}
