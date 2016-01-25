package com.zhang.decorator;

/*****************装饰器设计模式：对真实对象动态的添加功能*************************/

/**
 * 抽象组件
 * @author zhangjianbin
 *
 */
public interface ICar {

	//移动
	void move();
}


/**
 * 俱体构件对象（真实的对象）
 * @author zhangjianbin
 *
 */
class Car implements ICar{

	@Override
	public void move() {
		System.err.println("陆地上跑");
	}	
}

/**
 * 装饰器对象
 * 		
 * @author zhangjianbin
 *
 */
class SuperCar implements ICar{
	
	protected ICar car ;
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}
	
}

/**
 * 俱类装饰对象
 * 		会车游的车
 * @author zhangjianbin
 *
 */
class WeaterCar extends SuperCar{

	public WeaterCar(ICar car) {
		super(car);
	}
	
	//添加新的方法
	public void weater(){
		System.err.println("水中游的车");
	}
	
	//即能飞，又能移动
	@Override
	public void move() {
		super.move();
		weater();
	}
	
}




/**
 * 俱类装饰对象
 * 		会飞的车
 * @author zhangjianbin
 *
 */
class FlayCar extends SuperCar{

	public FlayCar(ICar car) {
		super(car);
	}
	
	//添加新的方法
	public void fly(){
		System.err.println("天上飞的车");
	}
	
	//即能飞，又能移动
	@Override
	public void move() {
		super.move();
		fly();
	}
	
}

/**
 * 俱类装饰对象
 * 		人工智能的车
 * @author zhangjianbin
 *
 */
class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	
	//添加新的方法
	public void autoMove(){
		System.err.println("人工智能车");
	}
	
	//即能飞，又能移动
	@Override
	public void move() {
		super.move();
		autoMove();
	}
	
}
