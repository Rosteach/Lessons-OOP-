/*�������� ����� ���������.
 Phone(String number, boolean camera, int sideSize)
 Nokia, Samsung
 IPhone(int appleId),IPhone4, IPhone5
 ��� ����� ������:
  - call(Phone ph)
  - printModel()
  - printAppleId()// ��� �������
 MainPhone(������ ���������)
�������� ���� ��������� � �������� ������� ���� � ������.(Nokia, Samsung, IPhone4, IPhone5)
� ������� ������� 2 (�������)������ �������� � ������� ������ call  � ������ ����� �� ������.
��� ���� ��������� �� ������ ������� ����� printModel.
����� ��� ���� ���������, ��� ������� �������� ������� ����� printAppleId.*/

package week3_lesson2_17_04_15;

public class iPhone5 extends iPhone{
	public iPhone5(String n,int aI){
		super(n,aI);
	}
	@Override
	public void printModel(){
		System.out.println(this.getClass().getSimpleName());
	}
}
