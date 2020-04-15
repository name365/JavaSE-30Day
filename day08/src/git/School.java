package git;

public class School {
	public static void main(String[] args) {
		Student stu = new Student();
        stu.name = "小明";
        stu.age = 16;
		
		Teacher tea = new Teacher();
		tea.name = "王老师";
        tea.age = 27;
        
        tea.say(stu.name,stu.age);
        stu.say(tea.name, tea.age);
	}	
}
class Student{
	String name;
	int age;
	String major;
	String interests;
	
	void say(String name, int age){
		System.out.println("这个学生是："+name+"年龄是："+age);	}
}

class Teacher{
	String name;
	int age;
	String teachAge;
	String course;
	
	void say(String name, int age){
		System.out.println("这个老师是："+name+"年龄是："+age);
	}
}