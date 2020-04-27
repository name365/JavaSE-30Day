package circle;

public class Cylinder extends Circle{

	private double length;
	
	public Cylinder(){
		length = 1.0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume(){	//计算圆柱体积
		return findArea() * length;
	}
}
