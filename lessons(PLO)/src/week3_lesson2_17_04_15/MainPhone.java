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
import java.util.ArrayList;
public class MainPhone {
	public static void main(String[] args){
	ArrayList<Phone> phones = new ArrayList<>();
	  phones.add(new Nokia("35"));
	  phones.add(new Nokia("36"));
	  //phones.add(new iPhone("37",12));
	  //phones.add(new iPhone("38",13));  
	  phones.add(new iPhone4("39",14));
	  phones.add(new iPhone4("40",15));  
	  phones.add(new iPhone5("41",16));
	  phones.add(new iPhone5("42",17));
	  phones.add(new Samsung("43"));
	  
	  int k1 = 1;
	  int k2 = 4;
	  phones.get(k1).call( phones.get(k2));
	  
	  System.out.println("\nСписок моделей телефонов:");
	  for( Phone phs:phones) phs.printModel();
	  System.out.println("\nСписок имен:");
	  
	  for( Phone phs:phones) {
	   if(phs instanceof iPhone){
	    iPhone iphone = (iPhone)(phs);
	    iphone.printAppleId();
	   }
	  }
	 }
}
