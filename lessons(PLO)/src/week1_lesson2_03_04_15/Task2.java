/*Написать метод принимающий две строки и возвращающий 
количество вхождений второй строки в первой.*/

package week1_lesson2_03_04_15;
import java.util.Scanner;
public class Task2 {
	public static void ret_Ind(String s, String subS){
		int Ind=0,min=0,max=0;
			if(s==subS) System.out.println("Stroky ravnie");
				else {for(int i=0;i<=s.length();i++){
					if(subS==s.substring(min,max))
						Ind++;
				}
			}
		System.out.print("FinalValue: "+Ind);	
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
			System.out.print("Enter s: ");
			String s1=scan.nextLine();
				System.out.print("Enter subS: ");	
				String s2=scan.nextLine();
					ret_Ind(s1,s2);
		scan.close();
	}	
}
