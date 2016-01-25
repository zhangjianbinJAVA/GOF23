package com.zhang.memento;

public class Client {

	public static void main(String[] args) {
		
		/**
		 * 备忘管理对象
		 */
		CareTaker taker = new CareTaker();
		
		/**
		 * 源发器
		 * 	将它设备的属性值复制到 EmpMeMento对象
		 */
		Emp emp = new Emp("zhang",18,200);
		
		//第一次修改
		/**
		 * 备忘一次
		 * 	将备忘对象复制到备忘管理对象
		 */
		taker.setMemento(emp.setEmpMeMento());
		System.err.println("第一次："+emp.getEname()+"--"+emp.getAge()+"--"+emp.getSalary());
		
		//第二次修改		
		emp.setAge(38);
		emp.setSalary(2000);
		//第二次备忘
		taker.setMemento(emp.setEmpMeMento());
		System.err.println("第二次："+emp.getEname()+"--"+emp.getAge()+"--"+emp.getSalary());

		//第三次修改
		emp.setAge(100);
		
		
		/**
		 * 恢复备忘对象
		 * 	  从备忘对象管理器中取出上一次备忘的对象，并将属性复制 到 源发器中的属性上
		 *   从而达到撤销的操作功能
		 */
		emp.recovery(taker.getMemento()); //恢复到备忘录对象保存的状态
		System.err.println("恢复后的状态："+emp.getEname()+"--"+emp.getAge()+"--"+emp.getSalary());

		
	}
	
}
