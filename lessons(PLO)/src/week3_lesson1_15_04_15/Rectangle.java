package week3_lesson1_15_04_15;

public class Rectangle extends Square{
	private double sideB;
	public double getSideB(){
		return sideB;
	}
	public Rectangle (double x,double y,double A,double B){
		super(x,y,A);
		sideB=B;
	}
	@Override
	public double getSquare(){
		return getSideA()*sideB; 
	}
	@Override
	public double getPerimetr(){
		return 2*getSideA()+2*sideB;
	}
}
