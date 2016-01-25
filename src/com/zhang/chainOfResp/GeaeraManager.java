package com.zhang.chainOfResp;

/**
 * 领导：总经理
 * 
 * @author zhangjianbin
 * 
 */
public class GeaeraManager extends Leader {

	public GeaeraManager(String name) {
		super(name);
	}

	/**
	 * 总经理处理的核心业务
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {

		/**
		 * 请假者小于30天的处理，大于30天的交给下一个领导
		 */
		if (leaveRequest.getLeaveDays() <30) {
			System.err.println("员工：" + leaveRequest.getEmpName() 
					+ "请假"+ leaveRequest.getLeaveDays() 
					+ "原因" + leaveRequest.getReason());
			System.err.println("总经理：" + this.name + "通过审批");
			
		} else {			
			System.err.println(leaveRequest.getEmpName()+"请假"
					+leaveRequest.getLeaveDays()+"天,"+"总经理："+this.name +"不批准");
		}

	}

}
