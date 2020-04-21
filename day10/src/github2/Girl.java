package github2;

public class Girl {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Girl(){
		
	}
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void marry(Boy boy){
		System.out.println("我想嫁给" + boy.getName());
	}
	/**
	  * 
	  * @Description 比较两个对象的大小
	  * @author subei
	  * @date 2020年4月21日上午9:17:35
	  * @param girl
	  * @return
	 */
	public int compare(Girl girl){
//		if(this.age >girl.age){
//			return 1;
//		}else if(this.age < girl.age){
//			return -1;
//		}else{
//			return 0;
//		}
		
		return this.age - girl.age;
	}
	
}
