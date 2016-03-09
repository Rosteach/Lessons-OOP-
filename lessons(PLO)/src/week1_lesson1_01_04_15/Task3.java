//Написать метод, принимающий в качестве параметра строку. Возвращяющий перевернутую строку, не использующий дополнительной строки.
package week1_lesson1_01_04_15;
import java.util.Scanner;
public class Task3 {
	public static void retEndtoFrontStr(String s){
		char p = 0;
			System.out.print("finalResult: ");
				for (int i = s.length()-1;i>=0;i--){
					p=s.charAt(i);	
						System.out.print(p);
				}
	}
	public static void main(String[] args){
	     System.out.print("Enter Str: ");
	     	Scanner scan = new Scanner(System.in); 
	     		String words = scan.nextLine();
	     			retEndtoFrontStr(words);
	     scan.close();
	}     
}
	
	
