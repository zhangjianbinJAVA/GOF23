package com.zhang.adapter;


/**
 * 适配器  (对象 适配器方式)
 * 		相当于 ps/2 接口转 usb 接口
 * @author zhangjianbin
 *
 */
public class Adapter2  implements Usb {

	private Ps2KeyBoard keyBoard;
	
	public Adapter2(Ps2KeyBoard ps2) {
		keyBoard = ps2;
	}
		
	@Override
	public void handleReq() {
		keyBoard.reqst(); // 调用键盘中的方法
	}

}
