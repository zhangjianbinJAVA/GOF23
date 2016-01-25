package com.zhang.mediator;

public class Client {

	/**
	 * 市场部对象和财务部对象之间实现交互
	 * 	 通过经理去沟通
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 中介者：经理
		 */
		Mediator m = new Persident();
		
		Martket mk = new Martket(m);
		Development dv = new Development(m);
		Finacial fn = new Finacial(m);
		
		/**
		 * 查看市场部的工作内容
		 */
		mk.selfAction();
		
		/**
		 * 市场部要和财务部门沟能，要钱
		 */
		mk.setFlg("Finacial");

		/**
		 * 向经理汇报情况，经理和财务去沟通
		 */
		mk.outAction();
		
		/**
		 结果：
		 	承接项目
			向总经理汇报工作，承接项目的进度
			数钱

		 */
		
	}
}
