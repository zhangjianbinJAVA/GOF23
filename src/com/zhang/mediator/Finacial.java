package com.zhang.mediator;

/**
 * 财报部门
 * @author zhangjianbin
 *
 */
public class Finacial implements Department {

	/**
	 * 持有中介者的引用
	 * 	 中介者：总经理
	 */
	private Mediator mediator;
	
	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		
		/**
		 * 作用：中介者（总经理）与财报部门相互持有各自的引用,互相可以找的到
		 */
		this.mediator.regiser("Finacial", this);
	}

	@Override
	public void selfAction() {
		System.err.println("数钱");
	}

	@Override
	public void outAction() {
		System.err.println("向总经理汇报工作，钱太多了，怎能么花");
	}

	
}
