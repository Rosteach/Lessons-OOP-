/*������� ����� ����� �� ������ ������ ��������.
������ Cat � Animal.
����� ������ �����:
- ������� �� ����� ���, ����� void printName()
- ������ �����, ����� void say()
- ��������� ������ �����, ����� void riseHair()
- ��������, ����� void eat()
- ����� ���� ���������, ����� void yellIfNotGorged()
*/

package hw3_Cat;

public class Animal {
	private String name;
	private String say;
	private boolean hair;
	private String eat;
	private int kilo;
	public String getName(){
		return name;
	}
	public String getSay(){
		return say;
	}
	public boolean getHair(){
		return hair;
	}
	public String getEat(){
		return eat;
	}
	public int getKilo(){
		return kilo;
	}
	public Animal(String name,String say,boolean hair,String eat,int kilo){
		this.name=name;this.say=say;this.hair=hair;
		this.eat=eat;this.kilo=kilo;
	}
	public void printName(){}
	public void say(){}
	public void riseHair(){}
	public void eat(){}
	public void yellIfNotGorged(){}
}
