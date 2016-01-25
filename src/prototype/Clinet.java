package prototype;

import java.util.Date;

public class Clinet {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 浅克隆
		shallowClone();

		// 深克隆
		deepClone();

	}

	private static void deepClone() throws CloneNotSupportedException {
		Date date = new Date();

		Sheep2 s1 = new Sheep2("羊", date);

		/**
		 * 浅克隆对象 俱有相同的属性，也引用相同的对象地址
		 */
		Sheep2 s2 = (Sheep2) s1.clone();

		System.err.println(s1.getBirthdays());

		date.setTime(1212121212L);

		System.err.println(s2.getBirthdays());
	}

	private static void shallowClone() throws CloneNotSupportedException {
		Date date = new Date();

		Sheep s1 = new Sheep("羊", date);

		/**
		 * 浅克隆对象 俱有相同的属性，也引用相同的对象地址
		 */
		Sheep s2 = (Sheep) s1.clone();

		System.err.println(s1.getBirthdays());

		date.setTime(1212121212L);

		System.err.println(s2.getBirthdays());
	}
}
