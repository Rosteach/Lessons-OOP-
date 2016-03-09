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

abstract class Phone {
	private String number;
	public Phone(String number){
		 this.number = number;
	}
	public String getNumber(){
		return number;
	} 
	public String getModel(){
		return this.getClass().getName();
	}
	public void printModel(){
		System.out.println(getModel());
	}
	public void call(Phone ph){
		String num1 = "Telephone ["+this.getModel()+"] with number ["+this.getNumber()+"]";
		String num2 = "Telephone ["+ph.getModel()+"] with number ["+ph.getNumber()+"]";
		System.out.println(num1 +" call on "+ num2);
	}
}
