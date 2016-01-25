package com.zhang.chainOfResp;

/**
 * 请假条：申请 封装请假条的基本信息
 * 
 * @author zhangjianbin
 * 
 */
public class LeaveRequest {

	private String empName; //员工
	private int leaveDays;  //请假天数
	private String reason;  //请假原因

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LeaveRequest(String empName, int leaveDays, String reason) {
		super();
		this.empName = empName;
		this.leaveDays = leaveDays;
		this.reason = reason;
	}

	public LeaveRequest() {

	}

	@Override
	public String toString() {
		return "LeaveRequest [empName=" + empName + ", leaveDays=" + leaveDays
				+ ", reason=" + reason + "]";
	}

}
