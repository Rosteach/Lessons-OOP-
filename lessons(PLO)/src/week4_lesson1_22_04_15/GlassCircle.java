package week4_lesson1_22_04_15;

public class GlassCircle extends AbstractGlass{
	public GlassCircle(String glass){
		super(glass);
		System.out.println("Glass = "+getClass().getSimpleName());
	}
}
