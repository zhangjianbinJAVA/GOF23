package com.zhang.buider;

/**
 * 装配飞船
 * 
 * @author zhangjianbin
 * 
 */
public class SxtAirShipBuiderDirector implements AirShipDirector {

	/**
	 * 定义构建者，因为装配者要调用构建者
	 */
	private AirShipBuider airShipBuider;

	/**
	 * 创建装配者对象时，传入构建者
	 * 
	 * @param airShipBuider
	 */
	public SxtAirShipBuiderDirector(AirShipBuider airShipBuider) {
		this.airShipBuider = airShipBuider;
	}

	@Override
	public AirShip directorAirShip() {
		/**
		 * 通过传入的构建者对象，构建相应的子组件对象
		 */
		Engine engine = airShipBuider.buiderEngine();
		OrbitalModule module = airShipBuider.buiderOrbitalModule();
		EscapeTower escapeTower = airShipBuider.buiderEscapeTower();

		AirShip airShip = new AirShip();
		airShip.setEngine(engine);
		airShip.setOrbitalModule(module);
		airShip.setEscapeTower(escapeTower);

		return airShip;
	}

}
