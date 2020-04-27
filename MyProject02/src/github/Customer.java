package github;
/**
  * 
  * @Description 为实参构造函数 
  * @author subei Email:subei@163.com
  * @version
  * @date 2020年4月22日下午4:29:10
  *
 */
public class Customer {

	private String name;// 客户姓名
	private char gender; // 性别
	private int age; // 年龄
	private String phone; // 电话号码
	private String email; // 电子邮箱

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer() {

	}

	public Customer(String name, char gender, int age, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

}
