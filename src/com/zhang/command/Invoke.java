package com.zhang.command;

/**
 * 
 * 调用者或发起者
 * 
 * @author zhangjianbin
 * 
 */
public class Invoke {

	// 可以多条命令，也可以是一条命令
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}

	/**
	 * 作用：用于调用执行该命令的执行者
	 */
	public void call() {
		// 执行命令前或执行命令后可以做一些复杂的处理
		command.execute();
	}

}
