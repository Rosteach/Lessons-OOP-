/*������� ����� ������� �� ������ ������ �����.
 ������ Plane � Wing.
 ������� ������ �����:
 - �������� (��� �������� ���� � ����� ������� ���������� ������� ��� ������, ������� �������� ��� ������, ����� void takeoff())
 - �������� ������� (������� ������� �� ������������������ ���������, ����� void selectRoute(int[][] coordinates))
 - ������� �� ����� �������, ����� void printRoute()*/

package hw3_Plane;

public class Wing {
	private int fuel;
	public int getFuel(){
		return fuel;	
	}
	public Wing(int fuel){
		this.fuel=fuel;
	}
}
