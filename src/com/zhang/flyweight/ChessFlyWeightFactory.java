package com.zhang.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * 
 * @author zhangjianbin
 * 
 */
public class ChessFlyWeightFactory {

	// 享元池 ：相当于容器
	private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

	/**
	 * 根据颜色获取棋子
	 * 
	 * @param color
	 * @return
	 */
	public ChessFlyWeight getChess(String color) {
		if (map.get(color) != null) {
			return map.get(color);
		} else {
			ChessFlyWeight cfw = new ConCeaterChess(color);
			map.put(color, cfw);
			return cfw;
		}
	}

}
