package com.zhang.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类 用于存储数据
 * 
 * @author zhangjianbin
 * 
 */
public class ConcreteMyAggeregate {

	private List<Object> list = new ArrayList<Object>();

	/**
	 * 添加数据
	 * 
	 * @param obj
	 */
	public void addObject(Object obj) {
		this.list.add(obj);
	}

	/**
	 * 删除数据
	 * 
	 * @param obj
	 */
	public void moveObject(Object obj) {
		this.list.remove(obj);
	}

	/**
	 * 设置集合
	 * 
	 * @param list
	 */
	public void setList(List<Object> list) {
		this.list = list;
	}

	/**
	 * 获取集合
	 * 
	 * @return
	 */
	public List<Object> getList() {
		return list;
	}
	
	
	/**
	 * 对外部提供一个获取迭代器的方法
	 */
	public MyIterator createIterator(){
		return new ConcreateIteator();
	}

	/**
	 * 内部类实现迭代器 好处：可以直接操作外部类的属性
	 * 
	 * @author zhangjianbin
	 * 
	 */
	private class ConcreateIteator implements MyIterator {

		private int cursor; // 定义迭代器的指针，用于记录遍历时的位置

		@Override
		public void first() {
			this.cursor = 0;
		}

		@Override
		public void next() {
			if (cursor < list.size()) {
				this.cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			if (cursor < list.size()) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public boolean isFirst() {
			return this.cursor == 0 ? true : false;
		}

		@Override
		public boolean isLast() {
			return this.cursor == (list.size() - 1) ? true : false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}

	}

}
