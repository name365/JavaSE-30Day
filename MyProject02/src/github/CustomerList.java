package github;

public class CustomerList {

	private Customer[] customers;	//用来保存客户对象的数组
	private int total = 0;       //记录已保存客户对象的数量
	
	/**
	 * 用来初始化customers数组的构造器
	 * @param totalCustomer:指定数组的长度
	 */
	public CustomerList(int totalCustomer){
		customers = new Customer[totalCustomer];
	}
	/*
	 * 将参数customer添加到数组中最后一个客户对象记录之后
	 */
	public boolean addCustomer(Customer customer){
		if(total >= customers.length){
			return false;
		}
//		customers[total] = customer;
//		total++;
//		或
		customers[total++] = customer;
		return true;
	}
	/*
	 * 用参数customer替换数组中由index指定的
	 */
	public boolean replaceCustomer(int index, Customer cust){
		if(index >= total || index < 0){
			return false;
		}
		customers[index] = cust;
		return true;
	}
	/*
	 * 从数组中删除参数index指定索引位置的客户对象记录
	 */
	public boolean deleteCustomer(int index){
		if(index >= total || index < 0){
			return false;
		}
		for(int i = index;i < total - 1;i++){
			customers[i] = customers[i+1];
		}
		//最后有数据的元素需要置空
//		customers[total -1] = null;
//		total --;
		//或
		customers[--total] = null;
		return true;
	}
	/*
	 * 返回数组中记录的所有客户对象
	 */
	public Customer[] getAllCustomers(){
		
		Customer[] custs = new Customer[total];
		for(int i = 0;i < total;i++){
			custs[i] = customers[i];
		}
		return custs;
	}
	/*
	 * 返回参数index指定索引位置的客户对象记录
	 */
	public Customer getCustomer(int index){
		if(index < 0 || index >= total){
			return null;
		}
		
		return customers[index];
	}
	/*
	 * 获取客户的数量
	 */
	public int getTotal(){
		return total;
	}
	
}
