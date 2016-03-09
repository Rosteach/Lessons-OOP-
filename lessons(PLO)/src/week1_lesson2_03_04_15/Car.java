/*Task 5. ƒополнить классы Car и MainCar. 
ƒл€ автомобил€ добавить цвет(String) и обновить метод printAboutMe.
—оздать в MainCar 3 автомобил€, установить им цвета и номера.
¬ывести на экран состо€ние каждого объекта.

Task 6. ƒополнить классы Car и MainCar. 
ћетоды: start,move() stop(). Ёти объекты вывод€т на экран сообщение:
авто с номером таким-то завелась/начала движение/остановилась(с выключением двигател€).
ƒл€ автомобил€ эти методы должны мен€ть состо€ние авто(заводим соответсвующе поле/пол€)
≈сли авто уже завелась, то выводит сообщение: 
  - авто такое-то не могу завестись так как уже заведена или 
  - авто такое-то не могу ехать так как уже еду
  и т.д.
јвтомобиль не может ехать если не заведен двигатель, не может остановитьс€ если не едет и так далее.
ѕродумать все ограничени€ и реализовать эти 3 метода с учетом состо€ни€ авто.

¬ MainCar: 
  - создать 3 авто
  - все 3 авто завести
  - 2 авто поехали
  - все 3 авто остановить
*/

package week1_lesson2_03_04_15;
public class Car {
	 String number;
	 String color;
	 boolean start;// 0, тоесть false
	 boolean move;
	  
	 public void printAboutMe() {
	  System.out.println(number + " " + color);
	 }

	 public void start() {
		 if (start != true) {System.out.println("Car with number: ["+number+","+ color+"] has started");}
		 	else {System.out.println("Car with number: [" +number +","+ color+"] hasn't started");}
		 
	 }

	 public void move() {
		 if (start != true  &&  move != true) {System.out.println("Car with number: [" + number+","+ color+"] has moved");}
		 	else if (start == true && move == true) {System.out.println("Car with number: [" + number +","+ color+"] can't stop because hasn't moved");} 
		 		else {System.out.println("Car with number:["+ number +","+ color+ "] hasn't move");}
	 }

	 public void stop() {
		 if (start == true) {System.out.println("Car with number: [" + number +","+ color+ "] can't stop because hasn't started");}
	     	else if (move == true) {System.out.println("Car with number [" + number +","+ color+"] can't stop because hasn't moved");}
	     		else {System.out.println("Car with number: [" + number +","+ color+ "] has stopped");}
	 }
}
