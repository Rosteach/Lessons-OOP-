/*������ �������: 
 ������� ����� Phone � ������:
 static Phone[] numbers, String myNumber
 ��� �������� ������ �������-��������, �� �������� � ���� ������� numbers. 
 c ��������: 
 - isNumberExist(String number) - ��������� ������� �������� � ����
 - call(String number) - ������� �� ����� "������� �����-�� ������ ������-��"
 - sendSms(String number, String text) - ������� �� ����� ��������� � ���� �����������
 
����������� � 10 ���������.*/

package week2_lesson1_08_04_15;


public class Phone {
	private static Phone [] numbers = new Phone[10];
    private String myNumber;
    
    public Phone[] getNumbers(){
    	return numbers;
    }
    public void setNumbers(Phone[] numbers){
    	this.numbers=numbers;
    }
	
	public void isNumberExist(){
		
	}
	public void call(String number){
		
	}
	public void sendSms(String number,String text){
		
	}
}
