package com.zhang.iterator;

/**
 * 迭代器接口
 * @author zhangjianbin
 *
 */
public interface MyIterator {

	void first(); //将游标指向第一个元素
	void next();  //将游标指向下一个元素
	boolean hasNext(); //判断是否还有下一个元素
	
	boolean isFirst(); //判断是否是第一个
	boolean isLast(); //判断是否是最后一个
	
	Object getCurrentObj(); //获取当前游标指向的对象
	
}
