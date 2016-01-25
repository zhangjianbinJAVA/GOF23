package com.zhang.mediator;

/**
 * 研发部门
 * @author zhangjianbin
 *
 */
public class Development implements Department {

	/**
	 * 持有中介者的引用
	 * 	 中介者：总经理
	 */
	private Mediator mediator;
	
	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		
		/**
		 * 作用：中介者（总经理）与研发部门相互持有各自的引用,互相可以找的到
		 */
		this.mediator.regiser("development", this);
	}

	@Override
	public void selfAction() {
		System.err.println("专心开发项目");
	}

	@Override
	public void outAction() {
		System.err.println("向总经理汇报工作，没钱了，需要资金支持");
	}

	
}
