package com.zhang.command;

public class Client {

	public static void main(String[] args) {
		
		//命令对象
		Command cmd = new ConcreateCommand(new Receiver());
		
		//真正的调用者，也就是命令的发起者
		Invoke invoke = new Invoke(cmd);
		
		invoke.call();
	}
}
