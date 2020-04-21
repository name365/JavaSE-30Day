package account2;

public class Bank {

	private int numberOfCustomers;	//记录客户的个数
	private Customer[] customers;	//存放多个客户的数组
	
	public Bank(){
		customers = new Customer[10];
	}
	
	//添加客户
	public void addCustomer(String f,String l){
		Customer cust = new Customer(f,l);
//		customers[numberOfCustomers] = cust;
//		numberOfCustomers++;
		customers[numberOfCustomers++] = cust;
	}

	//获取客户的个数
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	//获取指定位置上的客户
	public Customer getCustomers(int index) {
//		return customers;	//可能报异常
		if(index >= 0 && index < numberOfCustomers){
			return customers[index];
		}
		
		return null;
	}	
	
}
