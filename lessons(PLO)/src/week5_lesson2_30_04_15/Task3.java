/* Task 3. Написать класс животное, где тип животного Animal передается дженериком. 
 Для класса реализовать метод say(выводит на экран сообщение):
 Кошка Cat говорит "мяу"
 Собака Dog говорит "гав"
 Лев Leo говорит "рррр"
  
public class Cat extends Animal<Cat>{
 @Override
 public void say(){
  System.out.println("мяу");
 }

}
[21:00:40] Кузменюк Максим: public class Animal<T extends Animal> {
 public void say(){
  System.out.println("Я не знаю кто я");
 }
}
[21:00:46] Кузменюк Максим: public class MainAnimal {
 public static void main(String[] args) {
  Animal<Cat> obj = new Cat();
  obj.say();
 }
}
 */

package week5_lesson2_30_04_15;

public class Task3 {

}
