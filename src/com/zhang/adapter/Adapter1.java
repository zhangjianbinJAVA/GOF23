package com.zhang.adapter;


/**
 * 适配器  (类 适配器方式)
 * 		相当于 ps/2 接口转 usb 接口
 * @author zhangjianbin
 *
 */
public class Adapter1 extends Ps2KeyBoard implements Usb {

	@Override
	public void handleReq() {
		super.reqst(); // 调用键盘中的方法
	}

}
