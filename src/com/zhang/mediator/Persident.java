package com.zhang.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者的实现类 总经理
 * 
 * @author zhangjianbin
 * 
 */
public class Persident implements Mediator {

	/**
	 * 存放相关的同事类
	 */
	private Map<String, Department> map = new HashMap<String, Department>();

	@Override
	public void regiser(String name, Department d) {

		map.put(name, d);
	}

	@Override
	public void command(String name) {
		/**
		 * 根据不同的字符处理调用不同的命令 或者 根据不同的内容，总经理执行调用不同的方法
		 * 		例：
		 * 		需要找财务部，则传财务部门的标识就可以了，总经理就和财务部门沟通
		 */
		map.get(name).selfAction();		
	}

}
