/*Создать класс Рыба на основе класса "Продукт в супермаркете".
Классы Fish и Product.
Рыба должна уметь:
- Вывести свою цену, метод void printPrice()
- Вывести срок хранения, метод void printStoragePeriod()
- Проплыть, метод void swim()
- Проглотить другую рыбу, метод void cannibalism(Fish fish)
- Вывести свой штрихкод и цену, метод void printBarAndPrice()*/

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
