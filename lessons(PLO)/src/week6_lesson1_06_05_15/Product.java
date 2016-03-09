/*Task1. Написать класс Product у которого есть поля:
name,price, дата покупки.
с изначальной сортировкой по наименованию.
Пусть продукт выводится на экран: Морковка цена дата
Реализовать возможность отсортировать список:
 - по цене 
 - по дате закупки
В mainProduct:
создать 10 продуктов.
с разной датой закупки и разной ценой.
Вывести список без сортировки
Отсортировать список и вывести на экран
Отсортировать список по цене и вывести на экран
Отсортировать список по дате закупки и вывести на экран

equals-переопредить,*/

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
