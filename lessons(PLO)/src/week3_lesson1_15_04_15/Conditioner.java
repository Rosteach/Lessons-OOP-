/*Task. �������� ����� BlockConditioners, Conditioner � MainConditioners.
����� BlockConditioners-��� ����� ���������.
� ����� ���������� 10 �������������.
�������������.
����� Conditioner: int temperature, setTemperature(int k), turnOn(),turnOff(), getTemperature(),?? getTurn()
����� MainConditioner: ���������� ����, ��� ���������� ������ ������ �������  BlockConditioners.  
���������� ����:
1. ���������� ��������� ���� �������������
2. �������� ����������� � ��������...
3. ��������� ����������� � ��������...
4. ���������� ����������� ��� ������������ � ��������...
5. �����.*/

package week3_lesson1_15_04_15;

public class Conditioner {
	private int temp;
	public Conditioner() {
		
	}
	public int getTemp(){	
		return temp;
	}
	public void setTemp(int t){
		this.temp = t;
	}
	public void turnOn(){}
	public void turnOff(){}
}
