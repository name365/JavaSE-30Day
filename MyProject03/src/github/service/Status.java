package github.service;

/**
  * 
  * @Description 表示员工的状态
  * @author subei Email:subei@163.com
  * @version
  * @date 2020年5月6日下午5:09:18
  *
 */
public class Status {
	
	private final String NAME;
	private Status(String name) {
		this.NAME = name;
	}
	public static final Status FREE = new Status("FREE");
	public static final Status VOCATION = new Status("VOCATION");
	public static final Status BUSY = new Status("BUSY");
	public String getNAME() {
		return NAME;
	}
	@Override
	public String toString() {
		return NAME;
	}
	
}
