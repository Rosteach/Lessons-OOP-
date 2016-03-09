package week4_lesson1_22_04_15;

public class GlassSquare extends AbstractGlass{
	public GlassSquare(String glass){
		super(glass);
		System.out.println("Glass = "+getClass().getSimpleName());
	}
}
