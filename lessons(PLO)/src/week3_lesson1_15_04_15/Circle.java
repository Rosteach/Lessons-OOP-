package week3_lesson1_15_04_15;

public class Circle extends Figura{
	private double radius;
	public double getRad(){
		return radius;
	}
	public Circle(double x,double y,double A,double radius){
		super(x,y,A);
		this.radius = radius; 
	}
	@Override
	public double getSquare(){
		return Math.PI*getRad()*getRad(); 
	}
	@Override
	public double getPerimetr(){
		return 2*Math.PI*getRad();
	}
}
