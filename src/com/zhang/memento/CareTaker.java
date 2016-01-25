package com.zhang.memento;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @author zhangjianbin
 *
 */
public class CareTaker {
	
	//备忘类引用
	private EmpMeMento memento;

	//备忘类集合
//	private List<EmpMemento> list = new ArrayList<EmpMemento>();
	
	public EmpMeMento getMemento() {
		return memento;
	}

	public void setMemento(EmpMeMento memento) {
		this.memento = memento;
	}
	
}
