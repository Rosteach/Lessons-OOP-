/* Task 3. �������� ����� ��������, ��� ��� ��������� Animal ���������� ����������. 
 ��� ������ ����������� ����� say(������� �� ����� ���������):
 ����� Cat ������� "���"
 ������ Dog ������� "���"
 ��� Leo ������� "����"
  
public class Cat extends Animal<Cat>{
 @Override
 public void say(){
  System.out.println("���");
 }

}
[21:00:40] �������� ������: public class Animal<T extends Animal> {
 public void say(){
  System.out.println("� �� ���� ��� �");
 }
}
[21:00:46] �������� ������: public class MainAnimal {
 public static void main(String[] args) {
  Animal<Cat> obj = new Cat();
  obj.say();
 }
}
 */

package week5_lesson2_30_04_15;

public class Task3 {

}
