package git1;

import java.util.*;

import account2.Bank;

/*
 * 一、package关键字的使用
 * 1.为了更好的实现项目中类的管理，提供包的概念
 * 2.使用package声明类或接口所属的包，生命在源文件的首行
 * 3.包，属于标识符，遵循标识符的命名规则、规范"见名知意"
 * 4.每“.”一次,就代表一层文件目录。
 * 
 * 补充:同一个包下，不能命名同名接口或同名类。
 *     不同包下，可以命名同名的接口、类。
 * 
 * 二、import关键字的使用
 * import:导入
 * 1.在源文件中显式的使用import结构导入指定包下的类、接口
 * 2.声明在包的声明和类的声明之间
 * 3.如果需要导入多个结构，则并列写出即可
 * 4.可以使用"xxx.*"的方式,表示可以导入xxx包下的所有结构。
 * 5.如果导入的类或接口是java.lang包下的，或者是当前包下的，则可以省略此import语句。
 * 6.如果在代码中使用不同包下的同名的类。那么就需要使用类的全类名的方式指明调用的是哪个类。
 * 7.如果已经导入java.a包下的类。那么如果需要使用a包的子包下的类的话，仍然需要导入。
 * 8.import static组合的使用：调用指定类或接口下的静态的属性或方法.
 * 
 */
public class PackageImportTest {

	public static void main(String[] args) {
		String info = Arrays.toString(new int[]{1,2,3});
		
		Bank bank = new Bank();
		
		ArrayList list = new ArrayList();
		HashMap map = new HashMap();
		
		Scanner s = null;	
		
		System.out.println("hello");
		
		UserTest us = new UserTest();
		
	}
}
