package com.zhang.buider;

/**
 * 构建飞船的实现类
 * 
 * @author zhangjianbin
 * 
 */
public class SxtAirShipBuider implements AirShipBuider {

	@Override
	public Engine buiderEngine() {
		System.err.println("构建发动机");
		return new Engine("发动机"); //可以利用工厂模式创建对象 或单例模式
	}

	@Override
	public OrbitalModule buiderOrbitalModule() {
		System.err.println("构建轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower buiderEscapeTower() {
		System.err.println("构建逃逸舱");
		return new EscapeTower("逃逸舱");
	}

}
