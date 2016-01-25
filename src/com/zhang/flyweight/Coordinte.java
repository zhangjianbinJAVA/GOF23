package com.zhang.flyweight;

/**
 * 
 * 非共享的享元类
 * 棋子座标
 * 
 * @author zhangjianbin
 * 
 */
public class Coordinte {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Coordinte() {
		super();
	}

	public Coordinte(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}
