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
