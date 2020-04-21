package github1;

import github.Order;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderPublic = 2;
		//出了Order类之后，私有的结构、缺省的声明结构就不可调用了
//		order.orderDefault = 1;
//		order.orderPrivate = 3;//The field Order.orderPrivate is not visible
		
		order.methodPublic();
		//出了Order类之后，私有的结构、缺省的声明结构就不可调用了
//		order.methodDefault();
//		order.methodPrivate();//The method methodPrivate() from the type Order is not visible
	}
}
