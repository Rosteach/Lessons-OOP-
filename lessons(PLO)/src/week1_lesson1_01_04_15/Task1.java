//Ввести с консоли строку с символами и пробелами. Посчитать количество слов в предложении.
package week1_lesson1_01_04_15;
import java.util.Scanner;
public class Task1 {
    public static void NumberofStr(String s){
    	int k = 0;
    		for (int i = 0;i<=s.length()-1;i++){
    			int p = s.charAt(i);
    			k = p++;	  					
    		}
    	int endValue = k;
    		System.out.print("Number of space:"+k);
    }
    public static void main(String[] args){
    	System.out.print("Enter Str:");
    		Scanner scan = new Scanner(System.in); 
    			String words = scan.nextLine();
    				NumberofStr(words);
     scan.close();
    }
}
