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

public abstract class iPhone extends Phone{
	private int aplleId;
	public iPhone(String n,int aI){
		super(n);
		this.aplleId=aI;
	}
	public void printAppleId(){
		System.out.println("Telephone Id = ["+aplleId+"]");
	}
}
