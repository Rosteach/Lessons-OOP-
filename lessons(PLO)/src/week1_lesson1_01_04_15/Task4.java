/* Написать программу состоящую из методов:
	- метод, считывает с консоли строку и возвращает ее
	- метод, считывает с консоли символ и возращает его
	- метод, принимает строку и символ, делает поиск символа в строке, возвращает индекс последнего вхождения символа в строке
	- главный метод, только вызовы методов.*/

package week1_lesson1_01_04_15;
import java.util.Scanner;
public class Task4 {
	/*public static void reads_and_ret_str(String strg){
		System.out.print("Enter String: ");
			Scanner scan = new Scanner(System.in);
				strg = scan.nextLine();
					scan.close();
	}*/

	/*public static void reads_and_ret_symb(String symb){
		System.out.print("Enter Symbol: ");
			Scanner scan = new Scanner(System.in);
				symb = scan.nextLine();
					scan.close();	
	}*/
	
	public static void ret_Ind(String strg , String symb){
		int value = 0;
		int index = 0;
			if(index>=0){
				for(int i=strg.length()-1;i>strg.charAt(index);i--){
					char p =strg.charAt(index);
					if(p==symb.charAt(index))
					value++;
				}
		int endValue = value;	
		System.out.print(endValue);
		int End = strg.length()-value;	
		System.out.println();	
			System.out.println("Last Index: "+End);
		}
	}
	
	public static void main(String [] args){	
		Scanner scan = new Scanner(System.in);
			System.out.print("Enter strg: ");
			String strg = scan.nextLine();
				System.out.print("Enter symb: ");	
				String symb = scan.nextLine();
					//reads_and_ret_str(strg);
						//reads_and_ret_symb(symb);
							ret_Ind(strg,symb);
		scan.close();
		//ret_Ind(strg,symb);
	}
}
