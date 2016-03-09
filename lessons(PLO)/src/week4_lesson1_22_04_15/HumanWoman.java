package week4_lesson1_22_04_15;

public class HumanWoman extends AbstractHuman{
	public HumanWoman(String human){
		super(human);
		System.out.println("sex = "+getClass().getSimpleName());
	}
	public void takeGlass(AbstractGlass glass){	
	}
	public void putGlass(){}
	public void pourWaterOnTable(AbstractTable table){}
	public void fillGlass(){}
	public void printAboutMe(){}
}
