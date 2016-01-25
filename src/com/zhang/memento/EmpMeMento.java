package com.zhang.memento;

/**
 * 备忘录类
 * 
 * @author zhangjianbin
 * 
 */
public class EmpMeMento {

	private String ename;
	private int age;
	private double salary;

	/**
	 * 传入源发器 
	 * 		作备份操作
	 * 
	 * @param emp
	 */
	public EmpMeMento(Emp emp) {
		this.ename = emp.getEname();
		this.age = emp.getAge();
		this.salary = emp.getSalary();
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
