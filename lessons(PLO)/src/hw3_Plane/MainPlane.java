/*������� ����� ������� �� ������ ������ �����.
 ������ Plane � Wing.
 ������� ������ �����:
 - �������� (��� �������� ���� � ����� ������� ���������� ������� ��� ������, ������� �������� ��� ������, ����� void takeoff())
 - �������� ������� (������� ������� �� ������������������ ���������, ����� void selectRoute(int[][] coordinates))
 - ������� �� ����� �������, ����� void printRoute()*/

package hw3_Plane;

public class MainPlane {
	public static void main(String[] args){
		Plane p = new Plane();
		p.takeoff();
	}
}
