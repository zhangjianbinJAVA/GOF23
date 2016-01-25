package com.zhang.mediator;

/**
 * 市场部门
 * 
 * @author zhangjianbin
 * 
 */
public class Martket implements Department {

	/**
	 * 记录市场部要和哪个部门进行沟能，告许经理
	 */
	private String flg;
	/**
	 * 持有中介者的引用 中介者：总经理
	 */
	private Mediator mediator;

	public Martket(Mediator mediator) {
		super();
		this.mediator = mediator;

		/**
		 * 作用：中介者（总经理）与市场部门相互持有各自的引用,互相可以找的到
		 */
		this.mediator.regiser("Martket", this);
	}

	@Override
	public void selfAction() {
		System.err.println("承接项目");
	}

	@Override
	public void outAction() {
		System.err.println("向总经理汇报工作，承接项目的进度");

		/**
		 * 对经理说：需要财务部门的支持，这时传入财务部门的标识即可， 然后经理去和财务部门进行沟通
		 */
		mediator.command(flg);
	}


	/**
	 * 设置部门的标识
	 * @param flg
	 */
	public void setFlg(String flg) {
		this.flg = flg;
	}

}
