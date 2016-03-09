/*Создать класс Рыба на основе класса "Продукт в супермаркете".
Классы Fish и Product.
Рыба должна уметь:
- Вывести свою цену, метод void printPrice()
- Вывести срок хранения, метод void printStoragePeriod()
- Проплыть, метод void swim()
- Проглотить другую рыбу, метод void cannibalism(Fish fish)
- Вывести свой штрихкод и цену, метод void printBarAndPrice()*/

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
