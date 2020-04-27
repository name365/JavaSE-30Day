package git;
/*
 * 定义类Kids继承ManKind，并包括
 * 成员变量int yearsOld；
 * 方法printAge()打印yearsOld的值
 * 
 */
public class Kids extends ManKind{

	private int yearsOld;	//年限
	
	public Kids() {

	}

	public Kids(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge(){
		System.out.println("I am " + yearsOld);
	}
	
}
