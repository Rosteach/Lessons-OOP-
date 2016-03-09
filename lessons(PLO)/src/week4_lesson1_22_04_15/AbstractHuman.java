package week4_lesson1_22_04_15;

public abstract class AbstractHuman implements Humanable{
	private String human;
	public String getHuman(){
		return human;
	}
	public AbstractHuman(String human){
		this.human = human;
	}
}
