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

public class MainCar {
	public static void main(String[] args) {
		
		Car car1=new Car();System.out.println(car1.start);
		Car car2=new Car();
		Car car3=new Car();
			car1.number="111";
			car2.number="222";
			car3.number="333";
				car1.color="white";
				car2.color="green";
				car3.color="yellow";
					car1.printAboutMe();
					car2.printAboutMe();
					car3.printAboutMe();
						car1.start();
						car2.start();
						car3.start();
							car1.move();
							car2.move();
								car1.stop();
								car2.stop();
								car3.stop();
								
	}
}
