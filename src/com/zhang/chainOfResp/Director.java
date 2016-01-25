package com.zhang.chainOfResp;

/**
 * 领导：主任
 * 
 * @author zhangjianbin
 * 
 */
public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	/**
	 * 主任处理的核心业务
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {

		/**
		 * 请假者小于3天的处理，大于3天的交给下一个领导
		 */
		if (leaveRequest.getLeaveDays() < 3) {
			System.err.println("员工：" + leaveRequest.getEmpName() 
					+ "请假"+ leaveRequest.getLeaveDays() 
					+ "原因" + leaveRequest.getReason());
			System.err.println("主任：" + this.name + "通过审批");
			
		} else {			
			// 交给下一个领导
			if(this.nextLeader !=null){
				nextLeader.handleRequest(leaveRequest);
			}		
		}

	}

}
