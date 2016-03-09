/*Создать класс Кошка на основе класса Животное.
Классы Cat и Animal.
Кошка должна уметь:
- Вывести на экран имя, метод void printName()
- Подать голос, метод void say()
- Поднимать шерсть дыбом, метод void riseHair()
- Питаться, метод void eat()
- Орать если ненаелась, метод void yellIfNotGorged()
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
