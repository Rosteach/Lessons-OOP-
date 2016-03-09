/*Task1. Ќаписать рекурсивный метод, который принимает в качестве параметров k.
ћетод выводит числа от k до 2.*/

package week4_lesson2_24_04_15;

public class Task1 {
	public static void main(String[] args){
		int k = 3;
		Method(k);
	}
	public static void Method(int k){
		System.out.print(k+", ");
		if(k<2)Method(k+1);
		if(k>2)Method(k-1);
		//else if (k==2) System.out.println("error");
		//System.out.print(k);
	}
}
