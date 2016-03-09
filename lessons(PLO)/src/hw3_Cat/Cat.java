/*Создать класс Кошка на основе класса Животное.
Классы Cat и Animal.
Кошка должна уметь:
- Вывести на экран имя, метод void printName()
- Подать голос, метод void say()
- Поднимать шерсть дыбом, метод void riseHair()
- Питаться, метод void eat()
- Орать если ненаелась, метод void yellIfNotGorged() */

package hw3_Cat;

public class Cat extends Animal{
	public Cat(String name, String say,boolean hair,String eat,int kilo){
		super(name,say,hair,eat,kilo);
	}
	@Override
	public void printName(){
		System.out.println("Cat with name:["+getName()+"]");
	}
	public void say(){
		System.out.println("Cat with name:["+getName()+"],say : ["+getSay()+"]");
	}
	public void riseHair(){
		if(getHair()==true) System.out.println("Cat with name:["+getName()+"] has rised wool");
		else System.out.println("Cat with name:["+getName()+"] hasn't rised wool");
	}
	public void eat(){
		System.out.println("Cat with name:["+getName()+"] eat : ["+getKilo()+"] of "+"["+getEat()+"]");
	}
	public void yellIfNotGorged(){
		if(getKilo()>=500)System.out.println("I'm happy");
		else System.out.println("I'm hungry!!!");
	}
}
