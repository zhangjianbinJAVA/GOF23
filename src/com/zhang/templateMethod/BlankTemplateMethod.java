package com.zhang.templateMethod;

public abstract class BlankTemplateMethod {

	//具体方法
	public void takeNumber(){
		System.err.println("取号排队");
	}
	
	//办理俱体的业务 ：钩子方法
	public abstract void transact();
	
	public final void process(){
		this.takeNumber();
		
		this.transact();
		
		this.evaluate();
	}

	public void evaluate() {
		System.err.println("反愦");
	}
}
