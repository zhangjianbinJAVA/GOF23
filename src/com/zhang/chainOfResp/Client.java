package com.zhang.chainOfResp;

public class Client {


	public static void main(String[] args) {

		//领导对象
		Leader director = new Director("张三");// 主任
		Leader manager = new Manager("李四");// 经理
		Leader geaeraManager = new GeaeraManager("赵六");
		
		//组织领导的关系 :也就是责任链对象之间的关系
		director.setNextLeader(manager);
		manager.setNextLeader(geaeraManager);
		
		
		//请假操作开始
		LeaveRequest leaveRequest = new LeaveRequest("小黑",40,"回家看看");
		director.handleRequest(leaveRequest);
		
		/**
		 * 	员工：小黑请假10原因回家看看
			总经理：赵六通过审批

		 */
	
		
	}
}
