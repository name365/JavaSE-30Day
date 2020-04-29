package git3;

public class Circle extends GeometricObject{
	private double radius;

	public Circle() {	//初始化对象的color属性为“white”，weight属性为1.0，radius属性为1.0。
		super();	//super自带，不需再写
//		this.color = "white";
//		this.weight = 1.0;
		this.radius = 1.0;
	}

	//初始化对象的color属性为“white”，weight属性为1.0，radius根据参数构造器确定。
	public Circle(double radius) {	
		super();	//super自带，不需再写
//		this.color = "white";
//		this.weight = 1.0;
		this.radius = radius;
	}

	public Circle(double radius,String color,double weight) {
		super(color,weight);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//计算圆的面积
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
	@Override	//重写equals方法,比较两个圆的半径是否相等，如相等，返回true。
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Circle){
			Circle c = (Circle)obj;
			return this.radius == c.radius;
		}
		
		return false;
	}

	@Override
	public String toString() {	//重写toString方法,输出圆的半径。
		return "Circle [radius=" + radius + "]";
	}
	
}
