package com.zhang.bridge;

/**
 * 电脑
 * 	新添加电脑类时，就天然的俱备了个种品牌了
 * 	 
 * @author zhangjianbin
 *
 */
public class Computer {

	protected Brander brander;
	
	public Computer(Brander brander){
		this.brander = brander;
	}
	
	/**
	 * 销售电脑
	 */
	public void sale(){
		this.brander.sale();
	}
}


/**
 * 台式电脑
 * @author zhangjianbin
 *
 */
class Desktop extends Computer{

	public Desktop(Brander brander) {
		super(brander);		
	}
	/**
	 * 销售台式电脑
	 */
	public void sale(){
		System.err.println("销售台式电脑");
	}
}

/**
 * 笔记本电脑
 * @author zhangjianbin
 *
 */
class Laptop extends Computer{

	public Laptop(Brander brander) {
		super(brander);
	}
	/**
	 * 销售笔记本电脑
	 */
	public void sale(){
		System.err.println("销售笔记本电脑");
	}
}