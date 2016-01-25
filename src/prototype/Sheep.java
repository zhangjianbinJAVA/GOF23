package prototype;

import java.util.Date;

/**
 * 羊
 * 
 * @author zhangjianbin
 * 
 */
public class Sheep implements Cloneable {

	private String name;
	private Date birthdays;

	public Sheep() {
		super();
	}

	public Sheep(String name, Date birthdays) {
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
	 * 让该类俱有克隆功能 （浅克隆）
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return obj;
	}

}
