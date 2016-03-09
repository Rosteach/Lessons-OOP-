package week3_lesson1_15_04_15;

public class Square extends Figura {
	public Square (double x,double y,double A){
		super(x,y,A);
	}
	@Override
	public double getSquare(){
		return getSideA()*getSideA(); 
	}
	@Override
	public double getPerimetr(){
		return 4*getSideA();
	}

}
