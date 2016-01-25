package com.zhang.chainOfResp;

/**
 * 抽象类 领导
 * 
 * @author zhangjianbin
 * 
 */
public abstract class Leader {

	protected String name; // 领导的名子
	protected Leader nextLeader; // 责任链上的后继对象

	public Leader(String name) {
		this.name = name;
	}

	/**
	 * 设置责任链上的后继对象
	 * 
	 * @param nextLeader
	 */
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	/**
	 * 处理请求的核心业务方法
	 * 
	 * @param leaveRequest
	 */
	public abstract void handleRequest(LeaveRequest leaveRequest);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Leader getLeader() {
		return nextLeader;
	}

}
