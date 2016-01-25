package com.zhang.templateMethod;

public class Client {

	public static void main(String[] args) {
		
		/**
		 * 采用内部类
		 * 
		 */
		BlankTemplateMethod blank = new BlankTemplateMethod() {
			@Override
			public void transact() {
				System.err.println("取钱了");
			}
		};
		blank.process();
	}
}