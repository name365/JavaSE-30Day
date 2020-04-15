package github;
/*
 * 类中方法的声明和使用
 * 
 * 方法：描述类应该具有的功能。
 * 比如：Math类：sqrt()\random() \...
 *     Scanner类：nextXxx() ...
 *     Arrays类：sort() \ binarySearch() \ toString() \ equals() \ ...
 * 
 * 1.举例：
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 * public String getNation(String nation){}
 * 
 * 2. 方法的声明：权限修饰符  返回值类型  方法名(形参列表){
 * 					方法体
 * 			  }
 *   注意：static、final、abstract 来修饰的方法，后面再讲。
 *   
 * 3. 说明：
 * 		3.1 关于权限修饰符：默认方法的权限修饰符先都使用public
 * 			Java规定的4种权限修饰符：private、public、缺省、protected  -->封装性再细说
 * 		3.2 返回值类型:有返回值 VS 没有返回值
 * 			3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型。同时，方法中需要使用
 * 				 return返回值返回相应的类型的变量或常量。
 * 				   如果方法无返回值，则声明方法时，使用void来表示。通常，没有返回值的方法中，就不需要使用return。
 * 				   但是，如果使用的话，只能“return;”表示结束此方法的意思。
 * 			3.2.2 
 * 		
 */
public class CustomerTest {
	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.eat();
				
	}
}

//客户类
class Customer{
	
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("客户吃饭");
	}
	public void sleep(int hour){
		System.out.println("休息了" + hour + "个小时");
	}
	
	public String getName(){
		return name;
	}
	
	public String getNation(String nation){
		String info = "我的国籍是:" + nation;
		return info;
	}
}
