package com.zhang.buider;

/**
 * 构建飞船的接口
 * 
 * 提供三个方法，用于构建子组件对象
 * 
 * @author zhangjianbin
 * 
 */
public interface AirShipBuider {

	/**
	 * 构建发动机对象
	 * 
	 * @return
	 */
	Engine buiderEngine();

	/**
	 * 构建轨道舱对象
	 * 
	 * @return
	 */
	OrbitalModule buiderOrbitalModule();

	/**
	 * 构建逃逸舱对象
	 * 
	 * @return
	 */
	EscapeTower buiderEscapeTower();
}
