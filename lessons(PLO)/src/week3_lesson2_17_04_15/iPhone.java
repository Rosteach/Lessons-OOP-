/*Написать класс телефонов.
 Phone(String number, boolean camera, int sideSize)
 Nokia, Samsung
 IPhone(int appleId),IPhone4, IPhone5
 Что умеют делать:
  - call(Phone ph)
  - printModel()
  - printAppleId()// для айфонов
 MainPhone(список телефонов)
Добавить пару телефонов с номерами каждого вида в список.(Nokia, Samsung, IPhone4, IPhone5)
С консоли считать 2 (индекса)номера телефона и вызвать методы call  с одного номер на второй.
Для всех телефонов из списка вызвать метод printModel.
Затем для всех телефонов, для которых возможно вызвать метод printAppleId.*/

package week3_lesson2_17_04_15;

public abstract class iPhone extends Phone{
	private int aplleId;
	public iPhone(String n,int aI){
		super(n);
		this.aplleId=aI;
	}
	public void printAppleId(){
		System.out.println("Telephone Id = ["+aplleId+"]");
	}
}
