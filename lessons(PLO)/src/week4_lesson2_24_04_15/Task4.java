/*Task4. Написать метод, который выводит n-ный член последовательности Фибоначчи*/

package week4_lesson2_24_04_15;

public class Task4 {
	public static void main(String[] args){
		int n = 9;
		System.out.println(Fib(n));
	}
	public static int Fib(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		return Fib(n-1)+Fib(n-2);
	}	
}
