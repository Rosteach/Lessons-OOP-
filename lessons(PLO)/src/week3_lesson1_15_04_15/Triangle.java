package week3_lesson1_15_04_15;

public class Triangle extends Figura{
	private double sideB;
	public double getSideB(){
		return sideB;
	}
	public Triangle(double x,double y,double A,double B){
		super(x,y,A);
		sideB = B; 
	}
	@Override
	public double getSquare(){
		return getSideA()*sideB/2; 
	}
	@Override
	public double getPerimetr(){
		return getSideA()+sideB+Math.sqrt(getSideA()*getSideA()+sideB*sideB);
	}
}
