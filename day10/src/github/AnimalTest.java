package github;
/*
 * 面向对象的特征一:封装与隐藏
 * 一、问题的引入：
 *    当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。这里，赋值操作要受到
 *    属性的数据类型和存储范围的制约。但除此之外，没有其他制约条件。但是，实际问题中，我们往往需要给属性赋值
 *    加入额外限制条件。这个条件就不能在属性声明时体现，我们只能通过方法进行条件的添加。比如说，setLegs
 *    同时，我们需要避免用户再使用“对象.属性”的方式对属性进行赋值。则需要将属性声明为私有的(private)
 *    --》此时，针对于属性就体现了封装性。
 *    
 * 二、封装性的体现：
 *    我们将类的属性私有化(private),同时,提供公共的(public)方法来获取(getXxx)和设置(setXxx)
 *    
 *    拓展：封装性的体现：① 如上 ② 单例模式 ③ 不对外暴露的私有方法
 *    
 */
public class AnimalTest {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黄";
//		a.age = 1;
//		a.legs = 4;//The field Animal.legs is not visible
		
		a.show();
		
//		a.legs = -4;
//		a.setLegs(6);
		a.setLegs(-6);
		
//		a.legs = -4;//The field Animal.legs is not visible
		a.show();
		
		System.out.println(a.name);
		System.out.println(a.getLegs());
	}
}
class Animal{
	
	String name;
	private int age;
	private int legs; //腿的个数
	
	//对于属性的设置
	public void setLegs(int l){
		if(l >= 0 && l % 2 == 0){
			legs = l;
		}else{
			legs = 0;
		}
	}
	
	//对于属性的获取
	public int getLegs(){
		return legs;
	}
	
	public void eat(){
		System.out.println("动物进食");
	}
	
	public void show(){
		System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
	}
	
	//提供关于属性age的get和set方法
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		age = a;
	}
}
