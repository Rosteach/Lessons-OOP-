/* Написать метод определения поместится ли коробка полностью на полку?
 Метод принимает 4- аргумента длины и ширины полки и коробки.
 public boolean isContains(int boxWidth, int boxHeight, int shelfWidth, int shelfHeight)
 Пример:
 isContains(3, 4, 5, 3)
 true*/
package hw2;

public class korobka {
	public static void main(String[] args){
		
	}
	public boolean isContains(int boxWidth, int boxHeight, int shelfWidth, int shelfHeight){
		if((boxWidth>=shelfWidth)|(boxHeight>=shelfHeight))
		return true;
		else return false;
	}

}
