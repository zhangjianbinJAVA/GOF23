package prototype;

import java.util.Date;

/**
 * 羊
 * 
 * @author zhangjianbin
 * 
 */
public class Sheep2 implements Cloneable {

	private String name;
	private Date birthdays;

	public Sheep2() {
		super();
	}

	public Sheep2(String name, Date birthdays) {
		super();
		this.name = name;
		this.birthdays = birthdays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdays() {
		return birthdays;
	}

	public void setBirthdays(Date birthdays) {
		this.birthdays = birthdays;
	}

	/**
	 * 让该类俱有克隆功能 深克隆
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Sheep2 s = (Sheep2) obj;
		s.birthdays = (Date) this.birthdays.clone(); // 克隆属性对象 ，实现深克隆
		return obj;
	}

}
