/*Task3. Написать метод, который считает факториал для числа n.*/

package week4_lesson2_24_04_15;

public class Task3 {
	public static void main(String[] args){
		int n = 5;
		System.out.println(fact(n));
	}
	public static int fact(int n){
		if(n==1) return 1;
		return n*fact(n-1);
	}
}
