package circle;

public class Circle {

	public double radius;	//半径
	
	public Circle(){
		radius = 1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea(){	//计算圆的面积
		return Math.PI * radius * radius;
	}
}
