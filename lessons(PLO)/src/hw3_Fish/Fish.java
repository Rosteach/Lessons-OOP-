/*Создать класс Рыба на основе класса "Продукт в супермаркете".
Классы Fish и Product.
Рыба должна уметь:
- Вывести свою цену, метод void printPrice()
- Вывести срок хранения, метод void printStoragePeriod()
- Проплыть, метод void swim()
- Проглотить другую рыбу, метод void cannibalism(Fish fish)
- Вывести свой штрихкод и цену, метод void printBarAndPrice()*/

package hw3_Fish;

public class Fish extends Product{
	private String fish;
	public Fish(String p,int BC,String period,String fish){
		super(p,BC,period);
		this.fish=fish;
	}
	public String getFish(){
		return fish;
	}
	@Override
	public void printPrice(){System.out.println("Fish cost's: ["+getPrice()+"]");}
	public void printStoragePeriod(){System.out.println("Storage Period of the fish:"+getPeriod());}
	public void printBarAndPrice(){System.out.println("Price & barcode of the fish: ["+getPrice()+"] & ["+getBarCode()+"]" );}
	public void swim(){System.out.println("fish "+getFish()+" is swimming!");}
	public void cannibalism(Fish fish){System.out.println("Fish "+getFish()+" has eaten fish "+fish.getFish());}
}
