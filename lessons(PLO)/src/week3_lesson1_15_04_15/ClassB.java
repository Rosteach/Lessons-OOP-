/*�������� ������������ ��� ����������� � ����� ������������������.
� ������ A:
 - ����������� �� ���������
 - �� ����������� ���� �������������
 - ����������� ���� �������������
� ������ B extends A:
 - ���������� �� ���������
 - �� ����������� ���� �������������
 - ����������� ���� �������������
� ������ MyClass:
 - ������� 2 ������� ������ �*/

package week3_lesson1_15_04_15;

public class ClassB extends ClassA {
	public ClassB() {System.out.println("Constructur B");}
	{System.out.println("���� ������������� B"); }
	static { System.out.println("���� static ������������� B");}
}
