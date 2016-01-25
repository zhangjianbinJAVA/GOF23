package com.zhang.buider;

public class Client {

	public static void main(String[] args) {
		/**
		 * 创建装配者 和 构建者
		 */
		AirShipDirector airShipDirector = 
				new SxtAirShipBuiderDirector(new SxtAirShipBuider());

		/**
		 * 对过装配者获取飞船对象
		 */
		AirShip airShip = airShipDirector.directorAirShip();

		/**
		 * 发射飞船
		 */
		airShip.lunth();
	}
}
