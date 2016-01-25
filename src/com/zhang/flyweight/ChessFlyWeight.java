package com.zhang.flyweight;

/**
 * 享元类 棋子
 * 
 * @author zhangjianbin
 * 
 */
public interface ChessFlyWeight {

	void setColor(String c);

	String getColor();// 棋子的颜色

	void display(Coordinte coordinte); // 棋子显示的位置
}

/**
 * 
 * 俱体享元类
 * 		棋子实现类
 * 
 * @author zhangjianbin
 * 
 */
class ConCeaterChess implements ChessFlyWeight {

	//提供变量存储内部状态
	private String color;	
	
	public ConCeaterChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinte coordinte) {
		System.err.println("棋子颜色:" + this.color);
		System.err.println("棋子位置:" + coordinte.getX() + "-----"
				+ coordinte.getY());
	}

	@Override
	public void setColor(String c) {
		this.color = c;
	}

}