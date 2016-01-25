package com.zhang.chainOfResp;

/**
 * 领导：经理
 * 
 * @author zhangjianbin
 * 
 */
public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	/**
	 * 经理处理的核心业务
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {

		/**
		 * 请假者小于10天的处理，大于10天的交给下一个领导
		 */
		if (leaveRequest.getLeaveDays() <10) {
			System.err.println("员工：" + leaveRequest.getEmpName() 
					+ "请假"+ leaveRequest.getLeaveDays() 
					+ "原因" + leaveRequest.getReason());
			System.err.println("经理：" + this.name + "通过审批");
			
		} else {			
			// 交给下一个领导
			if(this.nextLeader !=null){
				nextLeader.handleRequest(leaveRequest);
			}		
		}

	}

}
