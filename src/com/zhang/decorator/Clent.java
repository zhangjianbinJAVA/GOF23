package com.zhang.decorator;

import javax.swing.Icon;

public class Clent {

	public static void main(String[] args) {
		ICar car = new Car();
		car.move();	
		
		/************对原来的车 添加新的功能：飞车*************/
		ICar flycar = new FlayCar(car);
		flycar.move();
		
		/************对飞车  添加新的功能：在水中跑*************/
		ICar weater = new WeaterCar(flycar);
		weater.move();
		
		/************添加两个新的功能：在水中跑，在天上飞*************/
		ICar weater2 = new WeaterCar(new FlayCar(car));
		weater2.move();
	
	}
}
