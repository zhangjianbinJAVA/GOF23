package com.zhang.factory.abstact;

public class Client {

	public static void main(String[] args) {
		/**
		 * 利用高端工厂创建高端产品
		 */
		CarFactory lunCar = new LunCarFactory();
		Engine lunEngine = lunCar.CreateEngine();
		Seat lunSeat = lunCar.CreateSeat();
		Typre luntyTypre = lunCar.CreateTypre();
		
		lunEngine.run(); //高端引擎跑
		lunEngine.start();//高端引擎启动

		/**
		 * 利用低端工厂创建低端产品
		 */
		CarFactory lowCar = new LowCarFactory();
		Engine lowEngine = lowCar.CreateEngine();
		Seat lowSeat = lowCar.CreateSeat();
		Typre lowtyTypre = lowCar.CreateTypre();
	}
}
