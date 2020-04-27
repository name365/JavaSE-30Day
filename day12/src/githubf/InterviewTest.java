package githubf;

import java.util.Random;
/*
 * 2.从编译和运行的角度看：
 * 重载，是指允许存在多个同名方法，而这些方法的参数不同。
 * 编译器根据方法不同的参数表，对同名方法的名称做修饰。
 * 对于编译器而言，这些同名方法就成了不同的方法。
 * 它们的调用地址在编译期就绑定了。Java的重载是可以包括父类和子类的，
 * 即子类可以重载父类的同名不同参数的方法。所以：对于重载而言，在方法调用之前，
 * 编译器就已经确定了所要调用的方法，这称为“早绑定”或“静态绑定”；
 * 而对于多态，只有等到方法调用的那一刻，解释运行器才会确定所要调用的具体方法，
 * 这称为“晚绑定”或“动态绑定”。
 * 
 * 引用一句Bruce Eckel的话：“不要犯傻，如果它不是晚绑定，它就不是多态。”
 */
//面试题：多态是编译时行为还是运行时行为？
//证明如下：
class Animal  {
 
	protected void eat() {
		System.out.println("animal eat food");
	}
}

class Cat  extends Animal  {
 
	protected void eat() {
		System.out.println("cat eat fish");
	}
}

class Dog  extends Animal  {
 
	public void eat() {
		System.out.println("Dog eat bone");

	}

}

class Sheep  extends Animal  {
 

	public void eat() {
		System.out.println("Sheep eat grass");

	}

 
}

public class InterviewTest {

	public static Animal  getInstance(int key) {
		switch (key) {
		case 0:
			return new Cat ();
		case 1:
			return new Dog ();
		default:
			return new Sheep ();
		}

	}

	public static void main(String[] args) {
		int key = new Random().nextInt(3);

		System.out.println(key);

		Animal  animal = getInstance(key);
		
		animal.eat();
		 
	}

}
