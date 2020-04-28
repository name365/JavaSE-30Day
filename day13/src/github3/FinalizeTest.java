package github3;
/*
 * 垃圾回收机制关键点
 * 垃圾回收机制只回收JVM堆内存里的对象空间。
 * 对其他物理连接，比如数据库连接、输入流输出流、Socket连接无能为力
 * 现在的JVM有多种垃圾回收实现算法，表现各异。
 * 垃圾回收发生具有不可预知性，程序无法精确控制垃圾回收机制执行。
 * 可以将对象的引用变量设置为null，暗示垃圾回收机制可以回收该对象。
 * 程序员可以通过System.gc()或者Runtime.getRuntime().gc()来通知系统进行垃圾回收，会有
 * 一些效果，但是系统是否进行垃圾回收依然不确定。
 * 垃圾回收机制回收任何对象之前，总会先调用它的finalize方法（如果覆盖该方法，让一
 * 个新的引用变量重新引用该对象，则会重新激活对象）。
 * 永远不要主动调用某个对象的finalize方法，应该交给垃圾回收机制调用。
 * 
 */
public class FinalizeTest {
	public static void main(String[] args) {
		Person p = new Person("Peter", 12);
		System.out.println(p);
		p = null;//此时对象实体就是垃圾对象，等待被回收。但时间不确定。
		System.gc();//强制性释放空间
	}
}

class Person{
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//子类重写此方法，可在释放对象前进行某些操作
	@Override
	protected void finalize() throws Throwable {
		System.out.println("对象被释放--->" + this);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

