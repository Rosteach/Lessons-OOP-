/*������� ����� ���� �� ������ ������ "������� � ������������".
������ Fish � Product.
���� ������ �����:
- ������� ���� ����, ����� void printPrice()
- ������� ���� ��������, ����� void printStoragePeriod()
- ��������, ����� void swim()
- ���������� ������ ����, ����� void cannibalism(Fish fish)
- ������� ���� �������� � ����, ����� void printBarAndPrice()*/

package hw3_Fish;

public class Product {
	private String price,period;
	private int BC;
	public String getPrice(){
		return price;
	}
	public int getBarCode(){
		return BC;
	}
	public String getPeriod(){
		return period;
	}
	public Product(String p,int BC,String period){
		this.price=p;this.BC=BC;this.period = period;
	}
	public void printPrice(){}
	public void printStoragePeriod(){}
	public void swim(){}
	public void printBarAndPrice(){}
}
