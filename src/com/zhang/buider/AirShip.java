package com.zhang.buider;

/**
 * 宇宙飞船类
 * 
 * @author zhangjianbin
 * 
 */
public class AirShip {

	/**
	 * 飞船所需的零件类
	 */
	private OrbitalModule orbitalModule; // 轨道舱
	private Engine engine; // 发动机
	private EscapeTower escapeTower; // 逃逸舱

	/**
	 * 发射方法
	 */
	public void lunth() {
		System.err.println("点火，发射");
	}

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}

}
