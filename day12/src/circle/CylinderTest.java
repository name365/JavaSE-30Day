package circle;

public class CylinderTest {
	public static void main(String[] args) {
		
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volues = cy.findVolume();
		System.out.println("圆柱的体积:" + volues);
		
		double area = cy.findArea();
		System.out.println("圆的面积: " + area);
	}
}
