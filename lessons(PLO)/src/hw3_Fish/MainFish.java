/*������� ����� ���� �� ������ ������ "������� � ������������".
������ Fish � Product.
���� ������ �����:
- ������� ���� ����, ����� void printPrice()
- ������� ���� ��������, ����� void printStoragePeriod()
- ��������, ����� void swim()
- ���������� ������ ����, ����� void cannibalism(Fish fish)
- ������� ���� �������� � ����, ����� void printBarAndPrice()*/

package hw3_Fish;

public class MainFish {
	public static void main(String[] args){
		Fish Salmon = new Fish("110 hrn",112233,"2 day's","Salmon");
		Salmon.printBarAndPrice();
		Fish Roach = new Fish("11 hrn",123,"3 day's","Roach");
		Roach.swim();
		Salmon.cannibalism(Roach);
	}
}
