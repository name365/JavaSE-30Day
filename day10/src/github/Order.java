package github;
/*
 * 三、封装性的体现，需要权限修饰符来配合。
 *   1.Java规定的4种权限：(从小到大排序)private、缺省、protected、public
 *   2.4种权限用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *   3.具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 * 		 修饰类的话，只能使用：缺省、public
 * 
 * 总结封装性：Java提供了4中权限修饰符来修饰类积累的内部结构，体现类及类的内部结构的可见性的方法。
 * 
 */
public class Order {

	private int orderPrivate;
	int orderDefault;
	public int orderPublic;
	
	private void methodPrivate(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	
	void methodDefault(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	
	public void methodPublic(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
}
