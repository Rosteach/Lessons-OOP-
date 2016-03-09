package week3_lesson1_15_04_15;

public class Figura {
	private double xPosition;
	private	double yPosition;
	private	double sideA;
	public double getSideA(){
		return sideA;
	}
	public double getSquare(){
		return 0;
	}
	public double getPerimetr(){
		return 0;
	}	
	public Figura(double x,double y,double A){
		this.xPosition = x;this.yPosition = y;this.sideA = A;
	}
}
