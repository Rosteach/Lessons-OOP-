package week2_lesson2_09_04_15;

public class Car {
	 String number;
	 String color;
	 Boolean start;
	 Boolean move;
	 	 
	 public void printAbout() {
	  System.out.println(number + " " + color);
	 }

	 public void start() {
	  
	  if (start == true) {
	   System.out.println("���� � �������=" + number + " ��������");
	  } else {
	   System.out.println("���� � �������=" + number + " �� ��������");
	  }
	 }

	 public void move() {
	  if (start == true && move ==true) {
	   System.out.println("���� � �������=" + number + " ������");
	  } else if (start == false && move ==true) {
	   System.out.println("���� � �������=" + number + " �� ���� ������ �� ���� �� ��������");
	   
	  } else {
	   System.out.println("���� � �������=" + number + " �� ������");
	  }
	 }

	 public void stop() {
	  if (start == false) {
	   System.out.println("���� � �������=" + number + " �� ���� ���������� �� ���� �� ��������");
	  } else if (move == false) {
	   System.out.println("���� � �������=" + number + "  �� ���� ���������� �� ���� �� �����");
	  }else {
	   System.out.println("���� � �������=" + number + " ����������");
	  }
	 }
}
