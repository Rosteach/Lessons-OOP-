/*Task1. �������� ����� Product � �������� ���� ����:
name,price, ���� �������.
� ����������� ����������� �� ������������.
����� ������� ��������� �� �����: �������� ���� ����
����������� ����������� ������������� ������:
 - �� ���� 
 - �� ���� �������
� mainProduct:
������� 10 ���������.
� ������ ����� ������� � ������ �����.
������� ������ ��� ����������
������������� ������ � ������� �� �����
������������� ������ �� ���� � ������� �� �����
������������� ������ �� ���� ������� � ������� �� �����

equals-������������,*/

package week6_lesson1_06_05_15;

public class Product implements Comparable{
	private String name;
	private int price,date;
	public Product(String n,int p,int d){
		this.name = n;
		this.price = p;
		this.date = d;
	}
	public int getPrice(){
		return price;
	}
	public int getDate(){
		return date;
	}
	public String getName(){
		return name;
	}
	@Override
	public boolean equals(Object obj){
		Product product = (Product)(obj);
		return this.getName().equals(product.getName());
		
	}
	@Override
	public int compareTo(Object obj){
		Product product = (Product)(obj);
		return this.name.compareTo(product.getName());
	}
	@Override
	public String toString(){
		//System.out.print(name+price+date);
		return name+","+price+","+date;
	}
}
