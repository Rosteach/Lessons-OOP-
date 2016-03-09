/*Task 5. ��������� ������ Car � MainCar. 
��� ���������� �������� ����(String) � �������� ����� printAboutMe.
������� � MainCar 3 ����������, ���������� �� ����� � ������.
������� �� ����� ��������� ������� �������.

Task 6. ��������� ������ Car � MainCar. 
������: start,move() stop(). ��� ������� ������� �� ����� ���������:
���� � ������� �����-�� ��������/������ ��������/������������(� ����������� ���������).
��� ���������� ��� ������ ������ ������ ��������� ����(������� ������������� ����/����)
���� ���� ��� ��������, �� ������� ���������: 
  - ���� �����-�� �� ���� ��������� ��� ��� ��� �������� ��� 
  - ���� �����-�� �� ���� ����� ��� ��� ��� ���
  � �.�.
���������� �� ����� ����� ���� �� ������� ���������, �� ����� ������������ ���� �� ���� � ��� �����.
��������� ��� ����������� � ����������� ��� 3 ������ � ������ ��������� ����.

� MainCar: 
  - ������� 3 ����
  - ��� 3 ���� �������
  - 2 ���� �������
  - ��� 3 ���� ����������
*/

package week1_lesson2_03_04_15;
public class Car {
	 String number;
	 String color;
	 boolean start;// 0, ������ false
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
