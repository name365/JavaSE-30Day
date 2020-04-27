package githubc;

public class Student extends Person{
	
	String major;
	int id = 1002;	//学号
	
	public Student(){

	}
	
	public Student(String name,int age,String major){
//		this.age = age;
//		this.name = name;
		super(name,age);
		this.major = major;
	}
	
	public Student(String major){
		this.major = major;
	}
	
	public void eat(){
		System.out.println("学生多吃有营养的食物");
	}
	
	public void Study(){
		System.out.println("学生，学习知识。");
		this.eat();
		//如果，想调用父类中被重写的，不想调用子类中的方法，可以：
		super.eat();
		super.walk();//子父类中未重写的方法，用"this."或"super."调用都可以
	}
	public void show(){
		System.out.println("name = " + this.name + ",age = " + super.age);
		System.out.println("id = " + this.id);	
		System.out.println("id = " + super.id);
	}
}
