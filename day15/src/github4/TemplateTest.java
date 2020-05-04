package github4;
/*
 * 抽象类的应用:模板方法的设计模式
 */
public class TemplateTest {
	public static void main(String[] args) {
		
		SubTemlate t = new SubTemlate();
		
		t.sendTime();
	}
}
abstract class Template{
	
	//计算某段代码执行所需花费的时间
	public void sendTime(){
		
		long start = System.currentTimeMillis();
		
		code();	//不确定部分，易变的部分
		
		long end = System.currentTimeMillis();
		
		System.out.println("花费的时间为:" + (end - start));
	}
	
	public abstract void code();
}

class SubTemlate extends Template{
	
	@Override
	public void code() {
		
		for(int i = 2;i <= 1000;i++){
			boolean isFlag = true;
			for(int j = 2;j <= Math.sqrt(i);j++){
				if(i % j == 0){
					isFlag = false;
					break;
				}
			}
			if(isFlag){
				System.out.println(i);
			}
		}
	}
}