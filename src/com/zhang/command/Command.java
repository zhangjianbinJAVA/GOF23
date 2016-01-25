package com.zhang.command;

/**
 * 命令的接口
 * 
 * @author zhangjianbin
 * 
 */
public interface Command {

	/**
	 * 执行命令
	 */
	void execute();
}

class ConcreateCommand implements Command {

	/**
	 * 命令的真正执行者
	 */
	private Receiver receiver;

	public ConcreateCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		//执行命令前或后可以做一些复杂的处理，如记录志
		
		// 执行命令
		receiver.action();
	}

}