package com.zhang.flyweight;

public class Client {

	public static void main(String[] args) {
		
		ChessFlyWeight cfy1 = new ChessFlyWeightFactory().getChess("黑色");
		ChessFlyWeight cfy2 = new ChessFlyWeightFactory().getChess("黑色");
		
		System.err.println(cfy1);//com.zhang.flyweight.ConCeaterChess@459189e1
		System.err.println(cfy2);//com.zhang.flyweight.ConCeaterChess@459189e1
		
		/*****新增外部状态：棋子的位置*****/
		cfy1.display(new Coordinte(10,10));// 棋子颜色:黑色
										   //棋子位置:10-----10		
		
		cfy2.display(new Coordinte(20,20));//棋子颜色:黑色
										   //棋子位置:20-----20
	}
}
